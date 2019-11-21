import javax.swing.*;

public class TextFrame extends JFrame implements Frame {

    private JTextArea textArea = new JTextArea();

    @Override
    public void createFrame() {
        this.textArea.setText("Text Area");
        this.textArea.setEditable(false);
        this.add(this.textArea);
        this.setTitle("Text Frame");
        this.setSize(300, 100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

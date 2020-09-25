import javax.swing.*;

public class ImageFrame extends JFrame implements Frame {

    private JLabel imageIcon = new JLabel(new ImageIcon("factory.jpg"));

    @Override
    public void createFrame() {
        this.add(imageIcon);
        this.setTitle("Image Frame");
        this.setSize(310, 310);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
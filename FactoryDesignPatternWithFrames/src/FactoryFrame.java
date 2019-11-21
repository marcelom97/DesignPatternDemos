import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactoryFrame extends JFrame implements ActionListener {

    String[] chooseOptions = {"TextArea", "Image", "Label", "Buttons"};
    JComboBox comboBox = new JComboBox(chooseOptions);
    JButton button = new JButton("Choose");

    public FactoryFrame() throws HeadlessException {
        super("Factory Frame");
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(2, 1));
        this.add(comboBox);
        this.button.addActionListener(this);
        this.add(button);
        this.setSize(300, 80);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Frame getFrame(String frameType) {
        if (frameType == null) {
            return null;
        }
        if (frameType.equalsIgnoreCase("TextArea")) {
            return new TextFrame();
        } else if (frameType.equalsIgnoreCase("Image")) {
            return new ImageFrame();
        } else if (frameType.equalsIgnoreCase("Label")) {
            return new LabelFrame();
        } else if (frameType.equalsIgnoreCase("Buttons")) {
            return new ButtonFrame();
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
//        System.out.println(this.comboBox.getSelectedItem());
        Frame temp = getFrame(this.comboBox.getSelectedItem().toString());
        temp.createFrame();
    }
}

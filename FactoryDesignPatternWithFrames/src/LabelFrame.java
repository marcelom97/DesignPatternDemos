import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame implements Frame {

    private JLabel label = new JLabel();

    @Override
    public void createFrame() {
        this.label.setOpaque(true);
        this.label.setBackground(Color.ORANGE);
        this.add(this.label);
        this.setTitle("Label Frame");
        this.setSize(300, 100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

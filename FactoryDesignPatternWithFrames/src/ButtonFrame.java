import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame implements Frame {

    private JButton[] buttons = new JButton[4];

    @Override
    public void createFrame() {
        this.setLayout(new GridLayout(2, 2));
        for (int i = 0; i < buttons.length; i++) {
            this.add(buttons[i] = new JButton("" + i));
        }
        this.setTitle("Button Frame");
        this.setSize(300, 100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

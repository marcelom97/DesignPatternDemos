import javax.swing.*;
import java.awt.*;

public class ObserverFrame extends JFrame implements Observer {

    private JPanel buttonPanel = new JPanel();
    private RoundButton[] buttons = new RoundButton[25];

    public ObserverFrame() {
        super("Observer Frame");

        for (int i = 0; i < buttons.length; i++) {
            this.buttonPanel.add(buttons[i] = new RoundButton("" + i));
        }
        this.add(this.buttonPanel);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.buttonPanel.setLayout(new GridLayout(5, 5));
    }

    @Override
    public void update(String buttonId) {
        RoundButton temp = (RoundButton) buttonPanel.getComponent(Integer.parseInt(buttonId));
        temp.doClick();
    }
}

import javax.swing.*;
import java.awt.*;

public class ObserverFrame extends JFrame implements Observer {

    private JPanel mainPanel = new JPanel();
    private JLabel text = new JLabel();

    public ObserverFrame() {
        super("Observer Frame");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(text);
        this.add(mainPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void update(String buttonId) {
        this.text.setText("Observer catches that button " + buttonId + " was clicked!");
    }
}

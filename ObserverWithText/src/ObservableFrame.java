import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservableFrame extends JFrame implements ActionListener {

    private List<ObserverFrame> observers = new ArrayList<ObserverFrame>();
    private JPanel mainPanel = new JPanel();
    private JButton[] buttons = new JButton[4];

    public ObservableFrame() {
        super("Observable Frame");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.mainPanel.setLayout(new GridLayout(2, 2));
        for (int i = 0; i < buttons.length; i++) {
            this.mainPanel.add(buttons[i] = new JButton("" + i));
            buttons[i].addActionListener(this);
        }
        this.add(mainPanel);
        this.setVisible(true);
    }

    public void setState(JButton clickedButton) {
        notifyAllObservers(clickedButton.getText());
    }

    public void attach(ObserverFrame newObserver) {
        this.observers.add(newObserver);
    }

    public void notifyAllObservers(String buttonId) {
        for (Observer observer : observers) {
            observer.update(buttonId);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton temp = (JButton) actionEvent.getSource();
        this.setState(temp);
    }
}

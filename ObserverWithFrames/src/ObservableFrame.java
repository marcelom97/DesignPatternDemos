import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservableFrame extends JFrame implements ActionListener {

    private List<ObserverFrame> observers = new ArrayList<ObserverFrame>();
    private JPanel buttonPanel = new JPanel();
    private RoundButton[] buttons = new RoundButton[25];

    public ObservableFrame() {
        super("Observable Frame");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.buttonPanel.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < buttons.length; i++) {
            this.buttonPanel.add(buttons[i] = new RoundButton("" + i));
            this.buttons[i].addActionListener(this);
        }
        this.add(this.buttonPanel);
    }

    public void setState(RoundButton clickedButton) {
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
        RoundButton temp = (RoundButton) actionEvent.getSource();
        this.setState(temp);
    }
}

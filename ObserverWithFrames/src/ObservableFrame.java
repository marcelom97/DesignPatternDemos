import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class ObservableFrame extends JFrame implements MouseListener {

    private List<ObserverFrame> observers = new ArrayList<ObserverFrame>();
    private JPanel buttonPanel = new JPanel();
    private RoundButton[] buttons = new RoundButton[25];

    public ObservableFrame() {
        super("Observable Frame");

        for (int i = 0; i < buttons.length; i++) {
            this.buttonPanel.add(buttons[i] = new RoundButton("" + i));
            this.buttons[i].addMouseListener(this);
        }
        this.add(this.buttonPanel);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.buttonPanel.setLayout(new GridLayout(5, 5));
    }

    public void setState(RoundButton clickedButton, Boolean isClicked) {
        notifyAllObservers(clickedButton.getText(), isClicked);
    }

    public void attach(ObserverFrame newObserver) {
        this.observers.add(newObserver);
    }

    public void notifyAllObservers(String buttonId, Boolean isClicked) {
        for (Observer observer : observers) {
            observer.update(buttonId, isClicked);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        RoundButton temp = (RoundButton) mouseEvent.getSource();
        this.setState(temp, true);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        RoundButton temp = (RoundButton) mouseEvent.getSource();
        this.setState(temp, false);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}

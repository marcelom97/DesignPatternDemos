package mvclab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

    private JTextField textField;
    private UserController controller;

    public ButtonActionListener(JTextField textField, UserController controller) {
        this.textField = textField;
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String newName = this.textField.getText();
        this.controller.setUserName(newName);
        this.controller.updateView();
    }
}

package mvclab;

import javax.swing.*;

public class UserController {

    private User model;
    private UserView view;
    private Frame window;
    private JButton button;
    private JTextField textField;
    private JTextArea textArea;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
        this.window = view.getWindow();
        this.button = this.window.getButton();
        this.textField = this.window.getTextField();
        this.textArea = this.window.getTextArea();
        this.button.addActionListener(new ButtonActionListener(this.textField, this));
    }

    public String getUserEmail() {
        return model.getEmail();
    }

    public void setUserEmail(String email) {
        model.setEmail(email);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public int getUserId() {
        return model.getId();
    }

    public void setUserId(int id) {
        model.setId(id);
    }

    public void updateView() {
        view.printUserDetails(model.getId(), model.getName(), model.getEmail());
    }
}

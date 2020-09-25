package mvclab;

import javax.swing.*;

public class UserView {

    private Frame window;
    private JTextArea textArea;

    public UserView(Frame window) {
        this.window = window;
        this.textArea = this.window.getTextArea();
    }

    public void printUserDetails(int id, String name, String email) {
        this.textArea.setText("--id:" + id + "\n" +
            "--name:" + name + "\n" +
            "--email:" + email);
    }

    public Frame getWindow() {
        return window;
    }
}
package mvclab;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public JButton button = new JButton("Update");
    private JTextArea textArea = new JTextArea();
    private JPanel panel = new JPanel();
    private JTextField textField = new JTextField();

    public Frame() {
        initComponents();
    }

    private void initComponents() {
        this.setSize(300, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        textArea.setEditable(false);

        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        this.add(panel);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getButton() {
        return button;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}

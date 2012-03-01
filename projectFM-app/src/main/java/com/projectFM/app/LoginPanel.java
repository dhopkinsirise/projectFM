package com.projectFM.app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class LoginPanel extends TransparentPanel {
    JButton btn;

    /**
     * 
     */
    private static final long serialVersionUID = -1649659332520400644L;

    public LoginPanel() {
        final JLabel UN = new JLabel("Username:");
        UN.setForeground(Color.white);
        final JLabel PW = new JLabel("Password:");
        PW.setForeground(Color.white);

        this.setLayout(new MigLayout("center"));

        this.add(UN);
        this.add(new JTextField(10), "wrap");
        this.add(PW);
        this.add(new JPasswordField(10), "wrap");

        this.btn = new JButton("goto upload");
        this.add(this.btn);

        this.btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                App.switchPanel("upload", (TransparentPanel) getParent());
            }
        });
    }
}

package com.projectFM.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class UploadPanel extends TransparentPanel {
    JButton btn;

    public UploadPanel() {

        this.setLayout(new MigLayout());

        // Create a file chooser
        final String filename = File.separator + "tmp";
        final JFileChooser fc = new JFileChooser(new File(filename));

        // Create the actions
        final Action openAction = new OpenFileAction((JFrame) this.getParent(), fc);
        final Action saveAction = new SaveFileAction((JFrame) this.getParent(), fc);

        // Create buttons for the actions
        final JButton openButton = new JButton(openAction);
        final JButton saveButton = new JButton(saveAction);

        // Add the buttons to the frame and show the frame
        this.add(openButton);
        this.add(saveButton, "wrap");

        this.btn = new JButton("goto login");
        this.add(this.btn);

        this.btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                App.switchPanel("login", (TransparentPanel) getParent());
            }
        });
    }

}

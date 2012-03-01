package com.projectFM.app;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

//This action creates and shows a modal save-file dialog.
public class SaveFileAction extends AbstractAction {
 JFileChooser chooser;
 JFrame frame;

 SaveFileAction(JFrame frame, JFileChooser chooser) {
     super("Save As...");
     this.chooser = chooser;
     this.frame = frame;
 }

 public void actionPerformed(ActionEvent evt) {
     // Show dialog; this method does not return until dialog is closed
     chooser.showSaveDialog(frame);

     // Get the selected file
     File file = chooser.getSelectedFile();
 }
};

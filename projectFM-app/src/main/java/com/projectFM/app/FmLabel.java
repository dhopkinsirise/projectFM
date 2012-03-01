package com.projectFM.app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

public class FmLabel extends JLabel {
    public FmLabel(Icon image) {
        super(image);
        this.setFont(new Font("Serif", Font.PLAIN, 36));
        this.setForeground(Color.white);
    }
}

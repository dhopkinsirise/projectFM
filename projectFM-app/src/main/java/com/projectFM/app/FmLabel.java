package com.projectFM.app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

public class FmLabel extends JLabel {

    public FmLabel() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FmLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
        // TODO Auto-generated constructor stub
    }

    public FmLabel(Icon image) {
        super(image);
        // TODO Auto-generated constructor stub
    }

    public FmLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
        // TODO Auto-generated constructor stub
    }

    public FmLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
        // TODO Auto-generated constructor stub
    }

    public FmLabel(String text) {
        super(text);
        this.setFont(new Font("Serif", Font.PLAIN, 36));
        this.setForeground(Color.white);
    }

}

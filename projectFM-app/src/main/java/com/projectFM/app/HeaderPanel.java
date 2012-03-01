package com.projectFM.app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class HeaderPanel extends TransparentPanel {
    HeaderPanel() {
        this.setLayout(new MigLayout("fillx"));
        final JLabel headerLbl = new JLabel("header");
        headerLbl.setFont(new Font("Serif", Font.PLAIN, 36));
        headerLbl.setForeground(Color.white);
        this.add(headerLbl, "center");
    }
}

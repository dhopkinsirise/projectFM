package com.projectFM.app;

import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class FooterPanel extends TransparentPanel {
    FooterPanel() {
        this.setLayout(new MigLayout("fillx"));
        this.add(new JLabel("footer"), "growx, center");
    }
}

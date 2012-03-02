package com.projectFM.app;

import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class FooterPanel extends TransparentPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 633870628454975591L;

    FooterPanel() {
        this.setLayout(new MigLayout("fillx"));
        this.add(new JLabel("footer"), "growx, center");
    }
}

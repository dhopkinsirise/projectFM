package com.projectFM.app;

import net.miginfocom.swing.MigLayout;

public class HeaderPanel extends TransparentPanel {
    /**
     * 
     */
    private static final long serialVersionUID = -4468332969741586221L;

    HeaderPanel() {
        this.setLayout(new MigLayout("fillx"));
        final FmLabel headerLbl = new FmLabel("header");
        this.add(headerLbl, "center");
    }
}

package com.projectFM.app;

import java.awt.LayoutManager;

import javax.swing.JPanel;

public class TransparentPanel extends JPanel {

    public TransparentPanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
        // TODO Auto-generated constructor stub
    }

    public TransparentPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        // TODO Auto-generated constructor stub
    }

    public TransparentPanel(LayoutManager layout) {
        super(layout);
        // TODO Auto-generated constructor stub
    }

    public TransparentPanel() {
        super();
        this.setOpaque(false);
    }

}

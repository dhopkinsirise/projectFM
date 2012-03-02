package com.projectFM.app;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class App {
    private JFrame appFrame;
    private TransparentPanel switchablePanel;
    private LoginPanel loginPanel;
    private UploadPanel uploadPanel;

    public App() {
        initComponents();
        initAppFrame();
        this.appFrame.setVisible(true);
    }

    private void initComponents() {
        this.appFrame = new JFrame();
        this.switchablePanel = new TransparentPanel();
        this.loginPanel = new LoginPanel();
        this.uploadPanel = new UploadPanel();

        this.uploadPanel.btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel("login");
            }
        });
        this.loginPanel.btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel("upload");
            }
        });

        this.switchablePanel.setLayout(new CardLayout());
        this.switchablePanel.add(this.loginPanel, "login");
        this.switchablePanel.add(this.uploadPanel, "upload");
        switchPanel("login");
    }

    private void initAppFrame() {

        this.appFrame.setTitle(StringConstants.PROJECT_TITLE);
        this.appFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        URL imgURL = null;
        Image img = null;
        try {
            imgURL = new URL(
                    "http://fc04.deviantart.net/fs70/f/2011/051/0/e/wood_grain_texture_4_by_hyenacub_stock-d3a1cr8.jpg");
            img = ImageIO.read(imgURL);
        } catch (final MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        final JPanel contentPane = new BackgroundPanel(img, BackgroundPanel.TILED);

        this.appFrame.setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("ins 0, fill, debug", "[]", "[][grow][]"));

        contentPane.add(new HeaderPanel(), "wrap, growx");
        contentPane.add(this.switchablePanel, "grow, center, wrap");
        contentPane.add(new FooterPanel(), "growx");
        this.appFrame.validate();
        this.appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void switchPanel(String nextPanel) {
        final CardLayout manager = (CardLayout) this.switchablePanel.getLayout(); // Fetch the layout manager
        manager.show(this.switchablePanel, nextPanel); // and tell the manager to show the named card        
    }

}

package com.projectFM.app;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class App {
    TransparentPanel switchable;

    public static void main(String[] args) {
        final JFrame appWindow = initAppWindow();
        appWindow.setVisible(true);
    }

    private static JFrame initAppWindow() {
        final JFrame appFrame = new JFrame();
        appFrame.setTitle(StringConstants.PROJECT_TITLE);
        appFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());

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
        appFrame.setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("ins 0, fill, debug", "[]", "[][grow][]"));
        contentPane.add(new HeaderPanel(), "wrap, growx");
        final TransparentPanel switchable = new TransparentPanel(); // This has the replaceable coloured panels as added components
        switchable.setLayout(new CardLayout());
        switchable.add(new LoginPanel(), "login");
        switchable.add(new UploadPanel(), "upload");
        /* final CardLayout manager = (CardLayout) switchable.getLayout();
        manager.show(switchable, "login");*/
        switchPanel("login", switchable);
        contentPane.add(switchable, "grow, center, wrap");
        contentPane.add(new FooterPanel(), "growx");
        appFrame.validate();
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return appFrame;
    }

    public static void switchPanel(String nextPanel, TransparentPanel switchable) {
        final CardLayout manager = (CardLayout) switchable.getLayout(); // Fetch the layout manager
        manager.show(switchable, nextPanel); // and tell the manager to show the named card        
    }
}

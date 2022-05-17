package edu.kz.nurunner.util;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Display extends JPanel {
    public Common common;

    public Display(Common common){
        this.common = common;
    }

    public Dimension getPreferredSize(){
        return new Dimension(common.windowWidth, common.windowHeight);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (common.map.background != null) {
            g2d.drawImage(common.map.background, 0, 0, getPreferredSize().width, getPreferredSize().height, this);
        }
        g2d.dispose();
    }
}

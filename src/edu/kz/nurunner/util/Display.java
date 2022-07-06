package edu.kz.nurunner.util;

import edu.kz.nurunner.entity.Student;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Display extends JPanel {
    public Common common;

    public Display(Common common){
        this.common = common;
    }

    public Dimension getPreferredSize(){
        return new Dimension(common.windowWidth, common.windowHeight);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();

        if (common.map.background != null) {
            g2d.drawImage(common.map.background, 0, 0, getPreferredSize().width, getPreferredSize().height, this);
        }

//        for (Student student: common.students){
//            student = new Student();
//            student.draw(g2d);
//        }
//        g2d.setPaint(new Color(150, 150, 150));

        g2d.setColor(new Color(125, 167, 116));
        g2d.fillRect(30, 20, 50, 50);
        g2d.setColor(new Color(42, 179, 231));
        g2d.fillRect(120, 20, 90, 60);
        g2d.setColor(new Color(70, 67, 123));
        g2d.fillRoundRect(250, 20, 70, 60, 25, 25);

        g2d.setColor(new Color(70, 120, 50));
        g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
        g2d.fillArc(120, 130, 110, 100, 5, 150);
        g2d.fillOval(270, 130, 50, 50);

        g2d.dispose();
    }
}

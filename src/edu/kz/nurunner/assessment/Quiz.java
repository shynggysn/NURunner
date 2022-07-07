package edu.kz.nurunner.assessment;

import edu.kz.nurunner.entity.Assessment;

import java.awt.*;

public class Quiz extends Assessment {

    public Quiz(){}

    public Quiz(int points){
        super(points);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(162, 25, 255));
        g2d.drawPolygon(new int[] {150, 160, 170}, new int[] {300, 280, 300}, 3);
        g2d.fillPolygon(new int[] {150, 160, 170}, new int[] {300, 280, 300}, 3);
    }

}

package edu.kz.nurunner.assessment;

import edu.kz.nurunner.entity.Assessment;

import java.awt.*;

public class Lab extends Assessment {

    public Lab(){}

    public Lab(int points){
        super(points);
    }
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(255, 0, 0));
        g2d.fillOval(100, 300, 20, 20);
    }
}

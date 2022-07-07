package edu.kz.nurunner.assessment;

import edu.kz.nurunner.entity.Assessment;

import java.awt.Graphics2D;
import java.awt.Color;

public class Homework extends Assessment {

    public Homework(){}

    public Homework(int points){
        super(points);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(0, 255, 0));
        g2d.fillRect(150, 300, 20, 20);
    }
}

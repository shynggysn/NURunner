package edu.kz.nurunner.entity;

import java.awt.Graphics2D;

public class Student extends Entity{
    public int grade;
    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillOval(270, 130, 50, 50);
    }
}

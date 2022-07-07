package edu.kz.nurunner.entity;

import java.awt.*;

public class Student extends Entity{
    public int grade;

    public Student(){}
    public Student(String name) {
        super(name);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(42, 255, 255));
        g2d.fillOval((int) this.position.x, (int) this.position.y, 40, 40);
    }
}

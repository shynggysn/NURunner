package edu.kz.nurunner.entity;

import edu.kz.nurunner.state.State;
import edu.kz.nurunner.util.Vector2D;

import java.awt.Graphics2D;
import java.awt.Color;

public class Student extends Entity{
    public int grade;

    public Student(){}
    public Student(String name) {
        super(name);
    }

    public Student(String name, Vector2D position, State state){
        super(name, position, state);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(42, 255, 255));
        g2d.fillOval((int) this.position.x, (int) this.position.y, 40, 40);
    }

    @Override
    public void step(){
        this.state.step(this);
    }
}

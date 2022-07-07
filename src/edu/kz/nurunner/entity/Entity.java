package edu.kz.nurunner.entity;


import edu.kz.nurunner.state.State;
import edu.kz.nurunner.util.Common;
import edu.kz.nurunner.util.Vector2D;

import java.awt.*;

public abstract class Entity {
    public String name;
    public Vector2D position;
    public State state;
    public Common common;

    public Entity() {
    }

    public Entity(String name){
        this.name = name;
    }

    public abstract void draw(Graphics2D g2d);
    public void step(){
        return;
    }
}

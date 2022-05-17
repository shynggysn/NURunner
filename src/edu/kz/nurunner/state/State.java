package edu.kz.nurunner.state;

import edu.kz.nurunner.entity.Entity;

public abstract class State {
    public boolean isOver;
    //public boolean isVisible;
    public abstract void step(Entity e);
}

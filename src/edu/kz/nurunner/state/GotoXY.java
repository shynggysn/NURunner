package edu.kz.nurunner.state;

import edu.kz.nurunner.entity.Entity;
import edu.kz.nurunner.util.Vector2D;

public class GotoXY extends State {
    private final Vector2D newPosition;

    public GotoXY(Vector2D newPosition){
        this.newPosition = newPosition;
    }

    @Override
    public void step(Entity e) {
        e.position = e.position.plus(newPosition.minus(e.position).normalize());
    }
}

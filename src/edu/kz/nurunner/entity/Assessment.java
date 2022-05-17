package edu.kz.nurunner.entity;

public abstract class Assessment extends Entity {
    public int points;

    public Assessment(){}
    public Assessment(int points){
        this.points = points;
    }
}

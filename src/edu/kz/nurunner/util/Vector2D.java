package edu.kz.nurunner.util;

public class Vector2D {
    public double x;
    public double y;

    public Vector2D(){}

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D v){
        this.x = v.x;
        this.y = v.y;
    }

    public double distanceTo(Vector2D other){
        return Math.sqrt(Math.pow((this.x-other.x),2) + Math.pow((this.y-other.y),2));
    }

    public Vector2D normalize(){
        double length = distanceTo(new Vector2D(0,0));
        return new Vector2D(this.x/length,this.y/length);
    }

    public Vector2D plus(Vector2D other){
        return new Vector2D(this.x+other.x,this.y+other.y);
    }

    public Vector2D minus(Vector2D other){
        return new Vector2D(this.x-other.x,this.y-other.y);
    }
}

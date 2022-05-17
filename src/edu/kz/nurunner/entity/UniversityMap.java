package edu.kz.nurunner.entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class UniversityMap extends Entity {

    public BufferedImage background;

    public UniversityMap(BufferedImage image){
        background = image;
    }
    @Override
    public void draw(Graphics2D g2d) {
    }
}

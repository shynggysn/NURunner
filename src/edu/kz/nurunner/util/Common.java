package edu.kz.nurunner.util;

import edu.kz.nurunner.entity.*;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Common {
    public int windowWidth;
    public int windowHeight;
    public UniversityMap map;
    public List<Academician> academicians;
    public List<Student> students;
    public List<Assessment> assessments;
    public List<Speaker> speakers;

    public Common(){
        try{
            map = new UniversityMap(ImageIO.read(new File("./NURunner_Solution/Demo/NUMap-Faded.jpg")));
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public int randomInt(int from, int to){
        return (int) ((Math.random() * (to - from)) + from);
    }

    public void stepAllEntities(){
        students.forEach(Entity::step);
        speakers.forEach(Entity::step);
    }

    public void drawAllEntities(Graphics2D g2d){
    }
}
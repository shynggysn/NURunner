package edu.kz.nurunner.util;

import edu.kz.nurunner.entity.*;

import java.awt.*;
import java.util.List;

public class Common {
    public static int windowWidth;
    public static int windowHeight;
    public static UniversityMap map;
    public static  List<Academician> academicians;
    public static List<Student> students;
    public static List<Assessment> assessments;
    public static List<Speaker> speakers;

    public static int randomInt(int from, int to){
        return (int) ((Math.random() * (to - from)) + from);
    }

    public static void stepAllEntities(){
        students.forEach(Entity::step);
        speakers.forEach(Entity::step);
    }

    public static void drawAllEntities(Graphics2D g2d){
    }
}
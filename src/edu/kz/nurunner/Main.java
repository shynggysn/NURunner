package edu.kz.nurunner;

import edu.kz.nurunner.entity.Student;
import edu.kz.nurunner.util.Common;
import edu.kz.nurunner.util.Display;

import javax.swing.*;

public class Main {

    private JFrame window;
    private Display display;
    private Common common;

    public static void main(String[] args) {
        System.out.println("My App");
        Student s1 = new Student();
        s1.grade = 5;
        changeGrade(s1);
        System.out.println(s1.grade);
    }

    public static void  changeGrade(Student student){
        student.grade = 10;
    }
}

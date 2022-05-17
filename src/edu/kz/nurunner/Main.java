package edu.kz.nurunner;

import edu.kz.nurunner.util.Common;
import edu.kz.nurunner.util.Display;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Main {

    private static JFrame window;
    private static Display display;
    private static Common common;

    private static int defaultStudentsNumber = 20;
    private static int defaultWindowWidth = 1200;
    private static int getDefaultWindowHeight = 700;

    public static void main(String[] args) {

        consoleMessage();
        common = new Common();
        display = new Display(common);

        try {
            handleArguments(args);
        } catch (NumberFormatException ex){
            System.out.println("Please enter only numbers in program arguments");
            return;
        }

        setFrame();
    }

    public static void setFrame(){
        if (window == null)
            window = new JFrame("NU GRADUATION by shynggysn");
        window.setSize(common.windowWidth, common.windowHeight);
        window.setLocation(400, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        display.paintComponent(window.getGraphics());
        window.add(display);

        addListener();
    }

    public static void consoleMessage(){
        System.out.println("NU GRADUATION by shynggysn");
        System.out.println();
        System.out.println("Optional command line arguments: [NumStudents] [WindowWidth] [WindowHeight]");
        System.out.println();
        System.out.println("Press P to play/pause");
        System.out.println("Press Q to quit");
    }

    public static void handleArguments(String[] args) throws NumberFormatException {
        switch(args.length){
            case 0:
                setProperties(defaultStudentsNumber, defaultWindowWidth, getDefaultWindowHeight);
                break;
            case 1:
                setProperties(Integer.parseInt(args[0]), defaultWindowWidth, getDefaultWindowHeight);
                break;
            case 2:
                setProperties(Integer.parseInt(args[0]), Integer.parseInt(args[1]), defaultWindowWidth);
                break;
            case 3:
                setProperties(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
        }
    }

    public static void setProperties(int studentsNumber, int windowWidth, int windowHeight) {
        common.students = new ArrayList<>(studentsNumber);
        common.windowWidth = windowWidth;
        common.windowHeight = windowHeight;
    }

    public static void addListener(){
        window.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent evt)
            {
                if(evt.getKeyCode()==KeyEvent.VK_Q)
                {
                    System.exit(0);
                }
                if(evt.getKeyCode() == KeyEvent.VK_P)
                {
                    //TODO pause app
                    System.out.println("app paused");
                }
            }
        });
    }

}

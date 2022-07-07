package edu.kz.nurunner;

import edu.kz.nurunner.util.Common;
import edu.kz.nurunner.util.Display;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Time;

public class Main {

    private static JFrame window;
    public static Display display;
    private static Common common;

    private static final int defaultStudentsNumber = 20;
    private static final int defaultWindowWidth = 1200;
    private static final int defaultWindowHeight = 700;

    public static void main(String[] args){
        consoleMessage();
        try {
            handleArguments(args);
        } catch (NumberFormatException ex){
            System.out.println("Please enter only numbers in program arguments");
            return;
        }
        display = new Display(common);

        initUI();
        window.setVisible(true);

//        while(true){
//            common.stepAllEntities();
//        }
    }

    public static void initUI(){
        window = new JFrame("NU GRADUATION by shynggysn");
        window.add(display);

        window.setSize(common.windowWidth, common.windowHeight);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        switch (args.length) {
            case 0 -> common = new Common(defaultStudentsNumber, defaultWindowWidth, defaultWindowHeight);
            case 1 -> common = new Common(Integer.parseInt(args[0]), defaultWindowWidth, defaultWindowHeight);
            case 2 -> common = new Common(Integer.parseInt(args[0]), Integer.parseInt(args[1]), defaultWindowHeight);
            case 3 -> common = new Common(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }
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

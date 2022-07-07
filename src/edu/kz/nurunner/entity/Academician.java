package edu.kz.nurunner.entity;


import edu.kz.nurunner.Main;
import edu.kz.nurunner.state.State;
import edu.kz.nurunner.util.Vector2D;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

public class Academician extends Entity {

    private static final String KatsuPath = "./NURunner_Solution/Demo/ShigeoKatsu.gif";
    private static final String TemizerPath = "./NURunner_Solution/Demo/SelimTemizer.gif";
    private static final String NivellePath = "./NURunner_Solution/Demo/HansDeNivelle.gif";
    private static final String TourassisPath = "./NURunner_Solution/Demo/VassiliosTourassis.gif";

    public Academician(){}

    public Academician(String name) {
        super(name);
    }

    public Academician(String name, Vector2D position, State state){
        super(name, position, state);
    }

    @Override
    public void draw(Graphics2D g2d) {
        try{
            switch (name) {
                case "Katsu" ->
                        g2d.drawImage(ImageIO.read(new File(KatsuPath)), (int) this.position.x, (int) this.position.y, 60, 80, Main.display);
                case "Temizer" ->
                        g2d.drawImage(ImageIO.read(new File(TemizerPath)), (int) this.position.x, (int) this.position.y, 60, 80, Main.display);
                case "Nivelle" ->
                        g2d.drawImage(ImageIO.read(new File(NivellePath)), (int) this.position.x, (int) this.position.y, 60, 80, Main.display);
                case "Tourassis" ->
                        g2d.drawImage(ImageIO.read(new File(TourassisPath)), (int) this.position.x, (int) this.position.y, 60, 80, Main.display);
            }
        } catch(IOException exception){
            System.out.println("Could not find academicians picture");
            System.exit(0);
        }
    }
}

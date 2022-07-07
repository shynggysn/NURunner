package edu.kz.nurunner.util;

import edu.kz.nurunner.entity.*;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public int windowWidth;
    public int windowHeight;
    public UniversityMap map;
    public List<Academician> academicians;
    public List<Student> students;
    public List<Assessment> assessments;
    public List<Speaker> speakers;

    private int studentsNumber;
    private static final String mapPath = "./NURunner_Solution/Demo/NUMap-Faded.jpg";


    private static final String[] academicianNames = new String[]{"Katsu", "Temizer", "Nivelle", "Tourassis"};
    private static final String[] speakerNames = new String[]{"Nazarbayev", "Tokayev"};
    public static final String[] studentNames = new String[]{"Anderson", "Ashwoon", "Aikin", "Bateman", "Bongard", "Bowers", "Boyd", "Cannon",
            "Cast", "Deitz", "Dewalt", "Ebner", "Frick", "Hancock", "Haworth", "Hesch", "Hoffman", "Kassing", "Knutson", "Lawless", "Lawicki",
            "Mccord", "McCormack", "Miller", "Myers", "Nugent", "Ortiz", "Orwig", "Ory", "Paiser", "Pak", "Pettigrew", "Quinn", "Quizoz", "Walter",
            "Ramachandran", "Resnick", "Sagar", "Schickowski", "Schiebel", "Sellon", "Severson", "Shaffer", "Solberg", "Soloman", "Sonderling",
            "Soukup", "Soulis", "Stahl", "Sweeney", "Tandy", "Trebil", "Trusela", "Trussel", "Turco", "Uddin", "Uflan", "Ulrich", "Upson", "Vader",
            "Vail", "Valente", "Van Zandt", "Vanderpoel", "Ventotla", "Vogal", "Wagle", "Wagner", "Wakefield", "Weinstein", "Weiss", "Woo", "Yang",
            "Yates", "Yocum", "Zeaser", "Zeller", "Ziegler", "Bauer", "Baxster", "Casal", "Cataldi", "Caswell", "Celedon", "Chambers", "Chapman",
            "Christensen", "Darnell", "Davidson", "Davis", "DeLorenzo", "Dinkins", "Doran", "Dugelman", "Dugan", "Duffman", "Eastman", "Ferro",
            "Ferry", "Fletcher", "Fietzer", "Hylan", "Hydinger", "Illingsworth", "Ingram", "Irwin", "Jagtap", "Jenson", "Johnson", "Johnsen",
            "Jones", "Jurgenson", "Kalleg", "Kaskel", "Keller", "Leisinger", "LePage", "Lewis", "Linde", "Lulloff", "Maki", "Martin", "McGinnis",
            "Mills", "Moody", "Moore", "Napier", "Nelson", "Norquist", "Nuttle", "Olson", "Ostrander", "Reamer", "Reardon", "Reyes", "Rice", "Ripka",
            "Roberts", "Rogers", "Root", "Sandstrom", "Sawyer", "Schlicht", "Schmitt", "Schwager", "Schutz", "Schuster", "Tapia", "Thompson", "Tiernan",
            "Tisler", "Adam", "Alex", "Aaron", "Ben", "Carl", "Dan", "David", "Edward", "Fred", "Frank", "George", "Hal", "Hank", "Ike", "John", "Jack",
            "Joe", "Larry", "Monte", "Matthew", "Mark", "Nathan", "Otto", "Paul", "Peter", "Roger", "Roger", "Steve", "Thomas", "Tim", "Ty", "Victor"};

    public Common(int studentsNumber, int windowWidth, int windowHeight){
        setProperties(studentsNumber, windowWidth, windowHeight);
        setBackground();
        generateAcademicians();
        generateStudents();
    }

    public int randomInt(int from, int to){
        return (int) ((Math.random() * (to - from)) + from);
    }

    public void stepAllEntities(){
        students.forEach(Entity::step);
        speakers.forEach(Entity::step);
    }

    public void drawAllEntities(Graphics2D g2d){
        drawAcademicians(g2d);
        drawStudents(g2d);
    }

    public void setProperties(int studentsNumber, int windowWidth, int windowHeight) {
        if(studentsNumber > studentNames.length){
            System.out.println("Max student number is " + studentNames.length);
            System.exit(0);
        }
        this.studentsNumber = studentsNumber;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
    }

    private void setBackground() {
        try{
            map = new UniversityMap(ImageIO.read(new File(mapPath)));
        } catch(IOException ex){
            System.out.println("Could not find university map picture");
            System.exit(0);
        }
    }

    private void generateAcademicians(){
        academicians = new ArrayList<>(academicianNames.length);
        for(int i = 0; i < academicianNames.length; i++){
            academicians.add(new Academician(academicianNames[i]));
        }
    }
    private void generateStudents(){
        students = new ArrayList<>(studentsNumber);
        for(int i = 0; i< studentsNumber; i++){
            students.add(new Student(studentNames[i]));
        }
    }

    private void drawAcademicians(Graphics2D g2d){
        for(Academician academician: academicians){
            academician.position = new Vector2D(randomInt(0, windowWidth), randomInt(0, windowHeight));
            academician.draw(g2d);
        }
    }

    private void drawStudents(Graphics2D g2d){
        for(Student student: students){
            student.position = new Vector2D(randomInt(0, windowWidth), randomInt(0, windowHeight));
            student.draw(g2d);
        }
    }
}
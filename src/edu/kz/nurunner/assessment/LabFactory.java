package edu.kz.nurunner.assessment;


import edu.kz.nurunner.entity.Assessment;
import edu.kz.nurunner.util.Vector2D;

public class LabFactory extends AssessmentFactory {

    public Lab lab;

    public LabFactory(){
    }

    @Override
    public Assessment createAssessment(Vector2D position) {
        return null;
    }
}

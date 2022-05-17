package edu.kz.nurunner.assessment;

import edu.kz.nurunner.entity.Assessment;
import edu.kz.nurunner.util.Common;
import edu.kz.nurunner.util.Vector2D;

public abstract class AssessmentFactory {
    public Common common;
    public abstract Assessment createAssessment(Vector2D position);
}

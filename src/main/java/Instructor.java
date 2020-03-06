import io.zipcoder.interfaces.Person;

public class Instructor extends Person implements Teacher {
    public double numberOfHoursPerLearner;
    public Instructor() {
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.numberOfHoursPerLearner = numberOfHours / learners.length;

    }
}

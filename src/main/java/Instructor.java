import io.zipcoder.interfaces.Person;

public class Instructor extends Person implements Teacher {
    public double numberOfHoursPerLearner;

    public Instructor() {
    }

    public Instructor(long id, String name) {
        super(id,name);
    }

    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        for (Learner o : learners) {
            o.learn(numberOfHours / learners.length);
        }
    }
}

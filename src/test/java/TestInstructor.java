import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor prof = new Instructor( 11233L, "");
        Assert.assertTrue(prof instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor prof = new Instructor(11233L, "");
        Assert.assertTrue(prof instanceof Person);
    }
    @Test
    public void testTeach() {
      Instructor prof = new Instructor(1345L, "");
      Student pat = new Student(1342L, "pat");
      Double expected = 5.0;
      prof.teach(pat,5.0);
      double actual = prof.numberOfHoursPerLearner;
      Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testLecture() {
    Instructor prof = new Instructor(1234L, "");
    Student oya = new Student(13245L, "oya");
    Student danny = new Student(2345L, "danny");;
    Learner[] learners = new Learner[]{oya, danny};
    prof.lecture(learners,5.0);
    Double expected = 2.5;

    Assert.assertEquals(expected, oya.getTotalStudyTime());
    }

}

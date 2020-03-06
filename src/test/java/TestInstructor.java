import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor prof = new Instructor( 11233L, 5.5);
        Assert.assertTrue(prof instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor prof = new Instructor(11233L, 5.5);
        Assert.assertTrue(prof instanceof Person);
    }
    @Test
    public void testTeach() {
      Instructor prof = new Instructor(1345L, 5.0);
      Student pat = new Student(1342L, "pat");
      Double expected = 5.0;
      prof.teach(pat,5.0);
      double actual = prof.numberOfHoursPerLearner;
      Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void lecture() {
    }

}

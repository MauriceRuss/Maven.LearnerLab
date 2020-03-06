import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
    Student pat = new Student( 11233L, "pat");
    Assert.assertTrue(pat instanceof Learner);
    }

    @Test
    public void testInheritance(){
    Student pat = new Student(11233L, "pat");
    Assert.assertTrue(pat instanceof Person );

    }
    
    @Test
    public void testLearn(){
    Student pat = new Student(21351L, "pat");
    Double expected = 5.0;
    pat.learn(5);
    Double actual = pat.getTotalStudyTime();
    Assert.assertEquals(expected, actual);
    }
}

import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
    Student pat = new Student();
    Double expected = 5.0;
    Double actual =pat.getTotalStudyTime();
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
    Person pat = new Student();
    String expected = "pat";
    String actual = pat.getName();
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn(){
    Student pat = new Student();
    Double expected = 5.0;
    pat.learn(5);
    Double actual = pat.getTotalStudyTime();
    Assert.assertEquals(expected,actual);
    }
}

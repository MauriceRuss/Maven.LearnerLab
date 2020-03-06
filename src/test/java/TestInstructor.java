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
    }

    @Test
    public void lecture() {
    }

}

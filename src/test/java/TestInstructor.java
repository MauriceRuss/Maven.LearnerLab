import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor prof = new Instructor( 11233L, 5.5);
        Assert.assertTrue(prof instanceof Teacher);
    }
    @Test
    public void teach() {
    }

    @Test
    public void lecture() {
    }

}

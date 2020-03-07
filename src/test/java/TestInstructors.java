import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors(){
        Instructors cohort =  Instructors.getInstance();
        cohort.add(new Instructor(1321, "joey"));
        cohort.add(new Instructor(11, "mark"));
        cohort.add(new Instructor(21, "steve"));
        int expectedSize = 3;
        int actualSize = cohort.countListSize();
        Assert.assertEquals(expectedSize, actualSize);

    }
}

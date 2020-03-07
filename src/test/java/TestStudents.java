import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){
    Students cohort =  Students.getInstance();
    cohort.add(new Student(1321, "joey"));
    cohort.add(new Student(11, "mark"));
    cohort.add(new Student(21, "steve"));
    int expectedSize = 3;
    int actualSize = cohort.countListSize();
        Assert.assertEquals(expectedSize, actualSize);

    }

}

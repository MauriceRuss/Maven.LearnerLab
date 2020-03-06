import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void remove() {
    }

    @Test
    public void add() {
    Person von = new Person();
    Person kevin = new Person();
    ArrayList personList = new ArrayList() {};
    personList.add(kevin);
    Boolean expected = personList.contains(kevin);
    Assert.assertTrue(personList.contains(kevin));
    }

    @Test
    public void findById() {
    }

}

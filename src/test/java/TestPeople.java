import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void removeTest() {
    Person von = new Person();
    Person kevin = new Person();
    ArrayList<Person> personList = new ArrayList(){ };
    personList.add(von);
    personList.add(kevin);
    personList.remove(kevin);
    Assert.assertFalse(personList.contains(kevin));
    }

    @Test
    public void addTest() {

    Person kevin = new Person();
    ArrayList personList = new ArrayList() {};
    personList.add(kevin);
    Boolean expected = personList.contains(kevin);
    Assert.assertTrue(personList.contains(kevin));
    }

    @Test
    public void findByIdTest() {
    People list = new People();
    Person sven = new Person();;
    sven.setId(123);
    list.add(sven);
    String expected = "sven";
    Person personId = list.findById(123);
    String actual = personId.getName();
    Assert.assertEquals(expected, actual);

    }

}

import io.zipcoder.interfaces.Person;

import java.sql.Array;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    public List<Person> personList;

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public boolean remove(Person person) {
        return personList.remove(person);
    }


    public boolean add(Person person) {
        return personList.add(person);
    }

   public  Person findById (long id){

       return null;
   }

   public Person removeById(long id){
        return  null;
    }

    public void removeAll(){

    }

    public Integer countListSize(){
        return null;
    }

    public Array toArrayList (){
        return null;
    }


    public Iterator iterator() {
        return null;
    }
}

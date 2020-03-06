import io.zipcoder.interfaces.Person;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> extends Person implements Iterable<E> {
   private ArrayList<Person> personList;

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public boolean remove(Person person) {
        return personList.remove(person);
    }


    public boolean add(Person person) {
        return personList.add(person);
    }

   public  Person findById (Person person, long id){

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


    public Iterator<E> iterator() {
        return null;
    }
}

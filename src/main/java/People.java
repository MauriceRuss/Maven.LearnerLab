import io.zipcoder.interfaces.Person;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E> extends Person implements Iterable<E> {
   private List<Person> personList;

   public People (){
       personList= new ArrayList<Person>();
   }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public boolean remove(Person person) {
        return personList.remove(person);
    }


    public boolean add(Person person) {
        return personList.add(person);
    }

   public  Person findById ( long id){

       return null;
   }

   public Person removeById(long id){
        return  null;
    }

    public void removeAll(){

    }

    public Integer countListSize(){
       int size = personList.size();
        return size;
    }

    public Array toArrayList (){
        return null;
    }


    public Iterator<E> iterator() {
        return null;
    }
}

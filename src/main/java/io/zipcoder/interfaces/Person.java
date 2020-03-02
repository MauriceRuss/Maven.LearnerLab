package io.zipcoder.interfaces;

public class Person {
    private  Long id;
    private  String name;

    public Person(Long id, String name){
        this. id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}

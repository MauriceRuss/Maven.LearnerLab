package io.zipcoder.interfaces;

public class Person {
    private long id = Long.MAX_VALUE;
    private String name;

    public Person(long id) {
        this.id = id;
    }

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    public Long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

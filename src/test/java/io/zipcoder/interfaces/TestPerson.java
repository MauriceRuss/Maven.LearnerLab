package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void setNameTest(){
        Person newPer = new Person();
        String expected = "Mark";
        newPer.setName(expected);
        String actual = newPer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void defaultConstructorTest(){
        String expectedName = "Mark";
        long expectedId = Long.MAX_VALUE;
        Person newPer = new Person();
        long actualId = newPer.getId();
        String actualName = newPer.getName();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

}

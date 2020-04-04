package com.bridgelab.generics;
import com.bridgelab.generics.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class TestMax {
    FindMax maxObject;
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
     maxObject = new FindMax();
        int integers = maxObject.findMaxInteger(5, 2, 3);
        Assert.assertEquals(5, integers);
        System.out.println("Maximum Among All is.."+integers);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject = new FindMax();
        int integers = maxObject.findMaxInteger(12, 44, 23);
        Assert.assertEquals(44, integers);
        System.out.println("Maximum Among All is.."+integers);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        maxObject = new FindMax();
        int integers = maxObject.findMaxInteger(7, 15, 23);
        Assert.assertEquals(23, integers);
        System.out.println("Maximum Among All is.."+integers);
    }
}

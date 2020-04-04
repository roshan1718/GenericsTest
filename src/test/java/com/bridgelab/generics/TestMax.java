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
}

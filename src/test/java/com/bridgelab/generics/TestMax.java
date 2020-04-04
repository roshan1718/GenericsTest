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
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        maxObject = new FindMax();
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(55.36f, 22.1f, 3.54f);
        Assert.assertEquals((Float)55.36f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }

    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject = new FindMax();
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(15.36f, 52.1f, 3.54f);
        Assert.assertEquals((Float)52.1f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        maxObject = new FindMax();
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(15.36f, 12.1f, 43.54f);
        Assert.assertEquals((Float)43.54f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        String largestString = FindMax.findLargestString("Strawberry", "Apple", "Aanana");
        Assert.assertEquals("Strawberry", largestString);
        System.out.println("Largest String Among All is.."+largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumTwo() {
        String largestString = FindMax.findLargestString("Apple", "Strawberry", "Banana");
        Assert.assertEquals("Strawberry", largestString);
        System.out.println("Largest String Among All is.."+largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumThree() {
        String largestString = FindMax.findLargestString("Apple", "Berries", "Strawberry");
        Assert.assertEquals("Strawberry", largestString);
        System.out.println("Largest String Among All is.."+largestString);
    }
}

package com.bridgelab.generics;
import com.bridgelab.generics.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class TestMax {
    FindMax maxObject;
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
        maxObject=new FindMax(5,2,3);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 5, maxInteger);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax(15,22,13);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 22, maxInteger);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax(5,12,33);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 33, maxInteger);
    }
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        maxObject=new FindMax(55.36f,22.1f,3.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 55.36f, maxFloat);
    }

    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax(15.36f,22.1f,13.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 22.1f, maxFloat);
    }
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax(5.36f,27.1f,33.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 33.54f, maxFloat);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        maxObject = new FindMax("Strawberry", "Apple", "Banana");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax("Apple", "Strawberry", "Banana");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax("Apple", "Berries", "Strawberry");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
}

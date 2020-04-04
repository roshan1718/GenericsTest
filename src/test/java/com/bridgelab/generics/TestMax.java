package com.bridgelab.generics;
import com.bridgelab.generics.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class TestMax {
    FindMax maxObject;
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(5,2,1,3);
        Assert.assertEquals((Integer) 5, maxInteger);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(15,22);
        Assert.assertEquals((Integer) 22, maxInteger);
    }
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(5,12,33,54);
        Assert.assertEquals((Integer) 54, maxInteger);
    }
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        Float maxFloat = (Float) maxObject.checkMaximum(55.36f,22.1f,3.54f,32.25f,27.35f);
        Assert.assertEquals((Float) 55.36f, maxFloat);
    }

    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        Float maxFloat = (Float) maxObject.checkMaximum(15.36f,22.1f);
        Assert.assertEquals((Float) 22.1f, maxFloat);
    }
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        Float maxFloat = (Float) maxObject.checkMaximum(5.36f,27.1f,32.5f,33.54f);
        Assert.assertEquals((Float) 33.54f, maxFloat);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        String largestString = (String) maxObject.checkMaximum("Strawberry", "Apple", "Banana","Cherries");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumTwo() {
        String largestString = (String) maxObject.checkMaximum("Apple", "Strawberry");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumThree() {
        String largestString = (String) maxObject.checkMaximum("Apple","Mangoes", "Berries", "Strawberry");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
}

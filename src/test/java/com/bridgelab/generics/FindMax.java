package com.bridgelab.generics;

import java.util.Arrays;

public class FindMax <E extends Comparable<E>>{

    E[] arrayElements;

    //Default Constructor
    public FindMax(){
    }
    public FindMax(E[] array) {
        this.arrayElements=array;
    }

    //function for check maximum of given inputs
    public static <E extends Comparable> E checkMaximum(E... arrayElements )
    {
        Arrays.sort(arrayElements);
        return arrayElements[arrayElements.length-1];
    }

    {
        System.out.println("Welcome To Find and Test Maximum Problem Using Generics");
    }
}

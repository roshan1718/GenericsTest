package com.bridgelab.generics;

public class FindMax <E extends Comparable<E>>{

    E first;
    E second;
    E third;

    //Default Constructor
    public FindMax(){
    }
    //Parameterized constructor
    public FindMax(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    //Find maximum of three values
    public static <E extends Comparable> E checkMaximum(E first, E second, E  third)
    {
        E max=first;
        if (second.compareTo(max) > 0 )
            max=second;
        if ( third.compareTo(max) > 0 )
            max=third;
        return max;
    }
    public E checkMaximum() {
        E maxResult = checkMaximum(first, second, third);
        printMaximum(maxResult);
        return maxResult;
    }
    //Print result
    private static <E> void printMaximum(E maxResult) {
        System.out.println("Maximum Among All is.."+maxResult);
    }


}

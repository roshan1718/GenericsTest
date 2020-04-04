package com.bridgelab.generics;

public class FindMax {

    public static Integer findMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        Integer maxInteger=firstNumber;
        if (secondNumber.compareTo(maxInteger) > 0 )
            maxInteger=secondNumber;
        if ( thirdNumber.compareTo(maxInteger) > 0 )
            maxInteger=thirdNumber;

        return maxInteger;
    }

    public static Float findMaxFloatingNumber(Float firstNumber, Float secondNumber, Float thirdNumber)
    {
        Float maxFloatingNumber=firstNumber;
        if (secondNumber.compareTo(maxFloatingNumber) > 0.0 )
            maxFloatingNumber=secondNumber;
        if ( thirdNumber.compareTo(maxFloatingNumber) > 0 )
            maxFloatingNumber=thirdNumber;

        return maxFloatingNumber;
    }

    public static String findLargestString(String firstString, String secondString, String thirdString)
    {
        String largestString=firstString;

        if (secondString.compareTo(largestString) > 0 )
            largestString=secondString;
        if ( thirdString.compareTo(largestString) > 0 )
            largestString=thirdString;

        return largestString;
    }

}

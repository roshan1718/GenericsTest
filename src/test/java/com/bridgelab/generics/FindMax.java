package com.bridgelab.generics;

public class FindMax {

    public static Integer findMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        Integer maxNumber=firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0 )
            maxNumber=secondNumber;
        if ( thirdNumber.compareTo(maxNumber) > 0 )
            maxNumber=thirdNumber;

        return maxNumber;
    }

}

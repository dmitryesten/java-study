package net.thumbtack.denisenko.trainee.introduction;


public class OperationsAboveFloatingNumbers {


    /**
     * @param valueOne
     * @param valueTwo
     * @return
     */
    public static double add(double valueOne, double valueTwo){
        return valueOne + valueTwo;
    }


    /**
     * @param valueOne
     * @param valueTwo
     * @return
     */
    public static double multiplication(double valueOne, double valueTwo){
        return valueOne * valueTwo;
    }


    /**
     * @param valueOne
     * @param valueTwo
     * @return
     */
    public static double compareValues(double  valueOne, double  valueTwo){
        return (valueOne == valueTwo) ? valueOne : (valueOne < valueTwo)? valueOne: valueTwo;
    }



}

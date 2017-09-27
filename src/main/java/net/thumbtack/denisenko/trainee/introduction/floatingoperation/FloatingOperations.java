package net.thumbtack.denisenko.trainee.introduction.floatingoperation;


public class FloatingOperations {

    private static final double eps = 0.000001;

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
    public static boolean compareValues(double  valueOne, double  valueTwo){
        return (Math.abs(valueOne - valueTwo) <= FloatingOperations.eps);
        //return (valueOne == valueTwo) ? valueOne : (valueOne < valueTwo)? valueOne: valueTwo;
    }



}

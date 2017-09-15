package net.thumbtack.denisenko.trainee.introduction;

public class ElementaryMathOperation {



    /*
        Amount of two numbers
     */
    public static int adder(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }

    /*
        Произведение двух чисел
     */

    public static int multy(int valueOne, int valueTwo){
        return valueOne * valueTwo;
    }

    /*
        Частное двух чисел
     */
    public static int devision(int valueOne, int  valueTwo) throws ArithmeticException{
        int resultDevision = 0;
        try{
            resultDevision = valueOne / valueTwo;
        }catch (ArithmeticException e ) {
            System.out.println("На ноль делить нельзя");
        }
        return resultDevision;
    }

    /*
        Остаток от деления
     */
    public static double remainderOfDivision(int  valueOne, int valueTwo)throws ArithmeticException{
        double resultRemainder = 0;
        try{
            resultRemainder = valueOne % valueTwo;
        }catch (ArithmeticException e ) {
            System.out.println("На ноль делить нельзя");
        }
            return resultRemainder;
    }

    /*
        Сравнение двух чисел
     */
    public static int compareValues(int  valueOne, int  valueTwo){
        return (valueOne == valueTwo) ? valueOne : (valueOne < valueTwo)? valueOne: valueTwo;
    }


}

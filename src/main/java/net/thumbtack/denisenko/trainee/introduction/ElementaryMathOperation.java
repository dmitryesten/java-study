package net.thumbtack.denisenko.trainee.introduction;

public class ElementaryMathOperation {



    /*
        Cумма чисел
     */
    public int adder(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }

    /*
        Произведение двух чисел
     */
    public int multy(int valueOne, int valueTwo){
        return valueOne * valueTwo;
    }

    /*
        Частное двух чисел
     */
    public int devision(int valueOne, int valueTwo){
        return valueOne / valueTwo;
    }

    /*
        Остаток от деления
     */
    public int remainderOfDivision(int valueOne, int valueTwo){
        return valueOne % valueTwo;
    }

    /*
        Сравнение двух чисел
     */
    public String compareValues(int valueOne, int valueTwo){
        if(valueOne < valueTwo)
            return valueTwo + " больше, чем " + valueOne;
        else
            return valueTwo  + " меньше, чем " + valueOne;
    }





}

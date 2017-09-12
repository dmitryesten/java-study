package net.thumbtack.denisenko.trainee.introduction;

public class ElementaryMathOperation {



    /*
        Cумма чисел
     */
	// REVU static
    public int adder(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }

    /*
        Произведение двух чисел
     */
	// REVU static
    public int multy(int valueOne, int valueTwo){
        return valueOne * valueTwo;
    }

    /*
        Частное двух чисел
     */
	// REVU static
    // why returns String ?
    // it must throw exception if valueTwo == 0
    public String devision(int valueOne, int  valueTwo) throws ArithmeticException{
        if(valueTwo == 0)
            return "На 0 делить нельзя";
        else
            return " "+(valueOne / valueTwo);
    }

    /*
        Остаток от деления
     */
    public String remainderOfDivision(int  valueOne, int valueTwo)throws ArithmeticException{
        if(valueTwo == 0)
            return "На 0 делить нельзя";
        else
            return " "+(valueOne % valueTwo);
    }

    /*
        Сравнение двух чисел
     */
    // REVU this method must return int (< 0, ==0 or >0)
    public String compareValues(int  valueOne, int  valueTwo){
        if(valueOne == valueTwo)
            return "Два числа равны";
         else if(valueOne < valueTwo)
            return valueTwo + " больше, чем " + valueOne;
        else
            return valueTwo  + " меньше, чем " + valueOne;
    }


}

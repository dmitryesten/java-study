package net.thumbtack.denisenko.trainee.introduction;

public class ElementaryOperationsAboveFloatingPointNumbers {

    public double add(double valueOne, double valueTwo){
        return valueOne + valueTwo;
    }

    public double multiplication(double valueOne, double valueTwo){
        return valueOne * valueTwo;
    }

    public String compareValues(double  valueOne, double  valueTwo){
        if(valueOne == valueTwo)
            return "Два числа равны";
        else if(valueOne < valueTwo)
            return valueTwo + " больше, чем " + valueOne;
        else
            return valueTwo  + " меньше, чем " + valueOne;
    }

}

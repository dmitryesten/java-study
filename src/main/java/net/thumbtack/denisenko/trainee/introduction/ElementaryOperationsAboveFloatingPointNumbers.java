package net.thumbtack.denisenko.trainee.introduction;

// REVU too long name
public class ElementaryOperationsAboveFloatingPointNumbers {

	// REVU static
    public double add(double valueOne, double valueTwo){
        return valueOne + valueTwo;
    }

	// REVU static
    public double multiplication(double valueOne, double valueTwo){
        return valueOne * valueTwo;
    }

	// REVU static, return int 
    public String compareValues(double  valueOne, double  valueTwo){
        if(valueOne == valueTwo)
            return "Два числа равны";
        else if(valueOne < valueTwo)
            return valueTwo + " больше, чем " + valueOne;
        else
            return valueTwo  + " меньше, чем " + valueOne;
    }

}

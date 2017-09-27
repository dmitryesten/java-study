package net.thumbtack.denisenko.trainee.lesson2.bignumberoperation;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberOperations {

    private int valueInt;
    private double valueDouble;

    private StringBuilder strInt = new StringBuilder(valueInt);
    private StringBuilder strDouble = new StringBuilder(String.valueOf(valueDouble));


    private BigInteger bigInteger = new BigInteger(strInt.toString());
    private BigDecimal bigDecimal = new BigDecimal(strDouble.toString());



    public String add(BigInteger a, BigInteger b){
        return a.add(b).toString();
    }

    public String multy(BigInteger a, BigInteger b){
        return a.multiply(b).toString();
    }

    public String devide(BigInteger a, BigInteger b){
        return a.divide(b).toString();
    }



    public int getValueInt() {
        return valueInt;
    }

    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }

    public double getValueDouble() {
        return valueDouble;
    }

    public void setValueDouble(double valueDouble) {
        this.valueDouble = valueDouble;
    }
}

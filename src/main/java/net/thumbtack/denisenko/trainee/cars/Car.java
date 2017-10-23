package net.thumbtack.denisenko.trainee.cars;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.interfaces.Colored;
import java.util.Objects;

public class Car implements Colored {

    private String mark;
    private Color color;
    private int weight;
    private int maxSpeed;


    public Car(String mark, int weight, int maxSpeed, Color color){
        this.mark = mark;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Car(String mark, int weight, int maxSpeed, String color) throws ColorException {
        this(mark, weight, maxSpeed, Color.colorFromString(color));
    }


    public String printInfoCar(){
        return "Марка: "+ getMark() + "; Вес: "+getWeight()+"кг; MaxСкорость: "+getMaxSpeed() +"км/ч" + " Цвет:"+color;
    }


    public String getMark() {
        return mark;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return weight == car.weight &&
                maxSpeed == car.maxSpeed &&
                Objects.equals(mark, car.mark);
    }


    @Override
    public int hashCode() {
        return Objects.hash(mark, weight, maxSpeed);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) throws ColorException {
        this.color = Color.colorFromString(color);
    }


}

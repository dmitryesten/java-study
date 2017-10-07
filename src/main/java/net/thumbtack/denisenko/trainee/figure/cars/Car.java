package net.thumbtack.denisenko.trainee.figure.cars;

import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.Colored;
import java.util.Objects;

public class Car implements Colored {


    private String mark;
    private String color;
    private int weight;
    private int maxSpeed;



    public Car(String mark, int weight, int maxSpeed){
        this.mark = mark;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public Car(String mark, int weight, int maxSpeed, String color){
        this.mark = mark;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Car(String mark, int weight, int maxSpeed, Color color){
        this.mark = mark;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color.toString();
    }


    public String printInfoCar(){
        return "Марка: "+ getMark() + "; Вес: "+getWeight()+"кг; MaxСкорость: "+getMaxSpeed() +"км/ч";
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
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color.toString();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

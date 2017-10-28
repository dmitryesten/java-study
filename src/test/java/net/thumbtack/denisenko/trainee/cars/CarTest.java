package net.thumbtack.denisenko.trainee.cars;

import net.thumbtack.denisenko.trainee.enums.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private String mark = "BMW";
    private int weight = 1234;
    private int maxSpeed = 120;
    private Color color = Color.GREEN;

    private Car car = new Car(mark, weight, maxSpeed, Color.GREEN);

    @Test
    public void printInfoCar() throws Exception {
        assertEquals("Марка: "+ mark +
                              "; Вес: "+weight+
                              "кг; MaxСкорость: "+maxSpeed+"км/ч"+
                              " Цвет:" + color,
                car.printInfoCar());
    }

    @Test
    public void testGet(){
        assertEquals(mark, car.getMark());
        assertEquals(weight,car.getWeight());
        assertEquals(maxSpeed, car.getMaxSpeed());
    }

    @Test
    public void testColor(){
        assertEquals(Color.GREEN, car.getColor());
        assertNotEquals(Color.RED, car.getColor());
    }



}
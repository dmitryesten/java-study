package net.thumbtack.denisenko.trainee.cars;

import net.thumbtack.denisenko.trainee.figure.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void printInfoCar() throws Exception {
        String mark = "s";
        int  w = 1234;
        int ms = 120;
        Color color = Color.GREEN;
        Car car = new Car(mark, w, ms, Color.GREEN);
        assertEquals("Марка: "+ mark + "; Вес: "+w+"кг; MaxСкорость: "+ms+"км/ч"+" Цвет:" + color,
                car.printInfoCar());

        assertEquals(mark, car.getMark());
        assertEquals(w,car.getWeight());
        assertEquals(ms, car.getMaxSpeed());

        Car car2 = new Car(mark,w,ms, Color.BLACK);
        assertEquals(Color.BLACK, car2.getColor());

    }

}
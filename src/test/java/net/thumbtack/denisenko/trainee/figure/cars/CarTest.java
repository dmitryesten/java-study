package net.thumbtack.denisenko.trainee.figure.cars;

import net.thumbtack.denisenko.trainee.figure.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void printInfoCar() throws Exception {
        String mark = "s";
        int  w = 1234;
        int ms = 120;
        Car car = new Car(mark, w, ms);
        assertEquals("Марка: "+ mark + "; Вес: "+w+"кг; MaxСкорость: "+ms+"км/ч",
                car.printInfoCar());

        assertEquals(mark, car.getMark());
        assertEquals(w,car.getWeight());
        assertEquals(ms, car.getMaxSpeed());

        Car car2 = new Car(mark,w,ms, Color.BLACK);
        assertEquals(Color.BLACK.toString(), car2.getColor());

    }

}
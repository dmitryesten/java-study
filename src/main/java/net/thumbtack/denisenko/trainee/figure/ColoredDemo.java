package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.figure.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry2D.Rectangle;

public class ColoredDemo {

    public static void main(String [] args) {
        Circle c = new Circle(2, 2, 3);
        Rectangle r = new Rectangle();
        System.out.println("Painting circle: "+ c.paint());
        System.out.println("Painting rectangle: "+ r.paint());


    }

}

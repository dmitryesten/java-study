package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.figure.geometry3D.Rectangle3D;

public class BoxDemo {

    public static void main(String [] args) {
        Box<Rectangle> box = new Box<>(new Rectangle());
        Box <Rectangle3D> box1 = new Box<>(new Rectangle3D());
        //Box <Circle> box2 = new Box<>(new Circle(1,1, 2) );

        System.out.println("прямоугольник "+box.getContent());
        System.out.println("CUBE "+box1.getContent());
        //System.out.println("Круг "+box2.getContent());

    }

}

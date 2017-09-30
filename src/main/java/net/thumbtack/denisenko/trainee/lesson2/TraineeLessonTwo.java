package net.thumbtack.denisenko.trainee.lesson2;

import net.thumbtack.denisenko.trainee.introduction.floatingoperation.FloatingOperations;
import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.introduction.rectangle.Rectangle;
import net.thumbtack.denisenko.trainee.introduction.triangle.Triangle;
import net.thumbtack.denisenko.trainee.lesson2.rectangle3d.Rectangle3D;

public class TraineeLessonTwo {

    public static void main(String [] args){

        Triangle triangle = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));

        System.out.println(Triangle.printCoordinats(triangle));
        System.out.println(Triangle.area(triangle));
        System.out.println(Triangle.isIsosceles(triangle));

    }
}

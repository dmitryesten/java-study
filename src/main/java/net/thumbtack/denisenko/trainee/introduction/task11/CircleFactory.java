package net.thumbtack.denisenko.trainee.introduction.task11;

import net.thumbtack.denisenko.trainee.introduction.task10.Circle;
import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;

public class CircleFactory {

    private static int numberInstances = 0;


    public CircleFactory(Point2D center, int radius){
        createCircle(center, radius);
    }


    private Circle createCircle(Point2D point, int radius){
        Circle circle = new Circle(point, radius);
        setNumberInstances(getNumberInstances() + 1);
        return circle;
    }


    public static int getNumberInstances() {
        return numberInstances;
    }


    private void setNumberInstances(int numberInstances) {
        CircleFactory.numberInstances = numberInstances;
    }




}

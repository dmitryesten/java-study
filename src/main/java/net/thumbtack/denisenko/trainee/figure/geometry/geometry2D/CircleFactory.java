package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import net.thumbtack.denisenko.trainee.enums.Color;

class CircleFactory {

    private static int numberInstances = 0;

    public static Circle createCircle(Point2D point, int radius, Color color){
        Circle circle = new Circle(point, radius, color);
        setNumberInstances(getNumberInstances() + 1);
        return circle;
    }


    public static int getNumberInstances() {
        return numberInstances;
    }


    // REVU remove, has no sense to set it manually. Or make private
    public static void setNumberInstances(int numberInstances) {
        CircleFactory.numberInstances = numberInstances;
    }
}

package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

class CircleFactory {

    private static int numberInstances = 0;

// REVU remove, you do not need in constructor in this class
    public CircleFactory(Point2D center, int radius){
        createCircle(center, radius);
    }

    // REVU static

    private Circle createCircle(Point2D point, int radius){
        Circle circle = new Circle(point, radius);
        setNumberInstances(getNumberInstances() + 1);
        return circle;
    }


    // REVU static
    public static int getNumberInstances() {
        return numberInstances;
    }


    // REVU static
    private void setNumberInstances(int numberInstances) {
        CircleFactory.numberInstances = numberInstances;
    }




}

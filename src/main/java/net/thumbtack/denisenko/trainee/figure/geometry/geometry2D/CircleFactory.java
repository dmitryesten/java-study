package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

class CircleFactory {

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

package net.thumbtack.denisenko.trainee.introduction;

public class Rectangle {

    private Point2D leftDownPoint = new Point2D( 1, 3);
    private Point2D rightUpPoint = new Point2D(5, 5);

    private int xLeftDownAngle;
    private int yLeftDownAngle;

    private int xRightDownAngle;
    private int yRightDownAngle;

    private int xRightUpAngle;
    private int yRightUpAngle;

    private int xLeftUpAngle;
    private int yLeftUpAngle;

    Rectangle(){
        Point2D leftDownPoint = new Point2D();
        this.xLeftDownAngle = leftDownPoint.setAbscissaOx(0);
        this.yLeftDownAngle = leftDownPoint.setOrdinateOy(0);
    }

    Rectangle(Point2D leftDownPoint, Point2D rightUpPoint){

        //Left-Down Angle
        this.xLeftDownAngle = leftDownPoint.getAbscissaOx();
        this.yLeftDownAngle = leftDownPoint.getOrdinateOy();
        //Right-Up Angle
        this.xRightUpAngle = rightUpPoint.getAbscissaOx();
        this.yRightUpAngle = rightUpPoint.getOrdinateOy();
    }


    Rectangle(Point2D rightUpPoint) {
        Point2D point2D = new Point2D(0, 0);
    }




}

package net.thumbtack.denisenko.trainee.introduction;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;

public class Rectangle {

    private int width;
    private int height;


    private int xLeftDownAngle;
    private int yLeftDownAngle;

    private int xRightUpAngle;
    private int yRightUpAngle;

    private int xRightDownAngle;
    private int yRightDownAngle;

    private int xLeftUpAngle;
    private int yLeftUpAngle;

    public Rectangle(){
        this(1, 1);
        Point2D leftDownPoint = new Point2D();
        this.xLeftDownAngle = leftDownPoint.setX(0);
        this.yLeftDownAngle = leftDownPoint.setY(0);
    }

    public Rectangle(Point2D leftDownPoint, Point2D rightUpPoint){

        this.width = rightUpPoint.getX() - leftDownPoint.getX();
        this.height = rightUpPoint.getY() - leftDownPoint.getY();

        //Left-Down Angle
        this.xLeftDownAngle = leftDownPoint.getX();
        this.yLeftDownAngle = leftDownPoint.getY();

        //Right-Down Angle
        this.xRightDownAngle = rightUpPoint.getX();
        this.yRightDownAngle = leftDownPoint.getY();
        //Right-Up Angle
        this.xRightUpAngle = rightUpPoint.getX();
        this.yRightUpAngle = rightUpPoint.getY();

        //Left-Up Angle
        this.xLeftUpAngle = leftDownPoint.getX();
        this.yLeftUpAngle = rightUpPoint.getY();

    }


    Rectangle(int width, int height) {
        Point2D firstPoint = new Point2D();
        Point2D secoundPoint = new Point2D();

        this.width = width;
        this.height = height;

        this.xLeftDownAngle = firstPoint.getX();
        this.yLeftDownAngle = firstPoint.getY();

        this.xRightUpAngle = secoundPoint.setX(width);
        this.yRightUpAngle = secoundPoint.setY(height);

    }



    public static String printCoordinatesRactangle(Rectangle rect) {
        return  "Left-Down angle: ("+rect.getXLeftDownAngle()+ ", " + rect.getYLeftDownAngle()+") " + "\r\n" +
                "Right-Down angle: ("+ rect.getXRightUpAngle()+ ", " + rect.getYLeftDownAngle()+ ") " + "\r\n"+
                "Right-Up angle: ("+ rect.getXRightUpAngle()+ ", " + rect.getYRightUpAngle()+ ") " + "\r\n" +
                "Left-Up angle: ("+ rect.getXLeftDownAngle()+ ", " + rect.getYRightUpAngle()+ ") " ;
    }





    /**
     * @param rect object class Rectangle
     * @return area's rectangle
     */
    public static int areaRectangle(Rectangle rect){
        return (rect.getXRightDownAngle() - rect.getXLeftDownAngle()) * (rect.getYLeftUpAngle() - rect.getYLeftDownAngle());
    }

    /**
     * @param point
     * @param rectangle
     * @return true if point is contained in rect and false if point isn't contained in rect
     */
    public static boolean isPointContainedInRactangle (Point2D point, Rectangle rectangle){
        return ((point.getX() >= rectangle.getXLeftDownAngle() && point.getX() <= rectangle.getXRightDownAngle())
                &&
                (point.getY() >=rectangle.getYLeftDownAngle() && point.getY()<=rectangle.getYLeftUpAngle())
        ) ? true : false;
    }


    /**
     * @param innerRect
     * @param externalRect
     * @return true if rect is contained in other rect and false if rect isn't contained
     */
    public static boolean isRectangleContainedInOtherRectangle(Rectangle innerRect, Rectangle externalRect){
        return !((innerRect.getXLeftDownAngle() >= externalRect.getXLeftDownAngle() && innerRect.getXRightDownAngle()<= externalRect.getXRightDownAngle())
                && (innerRect.getYRightUpAngle() >= externalRect.getYRightDownAngle() && innerRect.getYRightUpAngle()<=externalRect.getYRightUpAngle())
                ) ? true : false;
    }



    public static boolean isRectangleCrossingWithOtherRectangle(Rectangle crossingRect, Rectangle defaultRect) {
        return (crossingRect.getYLeftUpAngle() < defaultRect.getYRightDownAngle()||
                crossingRect.getYLeftDownAngle() > defaultRect.getYRightUpAngle()||
                crossingRect.getXRightDownAngle() < defaultRect.getXLeftUpAngle() ||
                        crossingRect.getXLeftUpAngle() > defaultRect.getXRightDownAngle() )? false : true;
        /*
        return ( a.y < b.y1 || a.y1 > b.y || a.x1 < b.x || a.x > b.x1 );
        return (crossingRect.getXRightUpAngle() < defaultRect.getXLeftDownAngle() ||
                crossingRect.getXLeftDownAngle() > defaultRect.getXRightUpAngle()||
                crossingRect.getYLeftDownAngle() < defaultRect.getYRightUpAngle() ||
                crossingRect.getYRightUpAngle() > defaultRect.getYLeftDownAngle() ) ? true : false;
        */
    }



    public void moveRectangale(int newX, int newY){
        xLeftDownAngle += newX;
        yLeftDownAngle += newY;

        xRightDownAngle +=newX;
        yRightDownAngle +=newY;

        xRightUpAngle += newX;
        yRightUpAngle += newY;

        xLeftUpAngle += newX;
        yLeftUpAngle += newY;
    }

    public void reduceRectangle(int valueReduceX, int valueReduceY ){
        xRightDownAngle -=valueReduceX;

        xRightUpAngle -= valueReduceX;
        yRightUpAngle -= valueReduceY;

        yLeftUpAngle -= valueReduceY;
    }



    //Left down angle
    public int getXLeftDownAngle() {
        return xLeftDownAngle;
    }

    public void setXLeftDownAngle(int xLeftDownAngle) {
        this.xLeftDownAngle = xLeftDownAngle;
    }

    public int getYLeftDownAngle() {
        return yLeftDownAngle;
    }

    public void setYLeftDownAngle(int yLeftDownAngle) {
        this.yLeftDownAngle = yLeftDownAngle;
    }
    // --------------------------------------------------------

    //Right Up angle
    public int getXRightUpAngle() {
        return xRightUpAngle;
    }

    public void setXRightUpAngle(int xRightUpAngle) {
        this.xRightUpAngle = xRightUpAngle;
    }

    public int getYRightUpAngle() {
        return yRightUpAngle;
    }

    public void setYRightUpAngle(int yRightUpAngle) {
        this.yRightUpAngle = yRightUpAngle;
    }
    //--------------------------------------------------------


    //Right Down Angle XY
    public int getXRightDownAngle() {
        return xRightDownAngle;
    }

    public void setXRightDownAngle(int xRightDownAngle) {
        this.xRightDownAngle = xRightDownAngle;
    }

    public int getYRightDownAngle() {
        return yRightDownAngle;
    }

    public void setYRightDownAngle(int yRightDownAngle) {
        this.yRightDownAngle = yRightDownAngle;
    }
    //-----------------------------------------------------------


    //Left Up Angle
    public int getXLeftUpAngle() {
        return xLeftUpAngle;
    }

    public void setXLeftUpAngle(int xLeftUpAngle) {
        this.xLeftUpAngle = xLeftUpAngle;
    }

    public int getYLeftUpAngle() {
        return yLeftUpAngle;
    }

    public void setYLeftUpAngle(int yLeftUpAngle) {
        this.yLeftUpAngle = yLeftUpAngle;
    }

    //-------------------------------------------------------------




}

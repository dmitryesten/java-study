package net.thumbtack.denisenko.trainee.introduction;

import java.util.Objects;

public class Rectangle {

    private Point2D leftDownPoint = new Point2D( 1, 3);
    private Point2D rightUpPoint = new Point2D(5, 5);

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

    Rectangle(){
        this(1, 1);
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


    Rectangle(int width, int height) {
        Point2D firstPoint = new Point2D();
        Point2D secoundPoint = new Point2D();
        this.xLeftDownAngle = firstPoint.getAbscissaOx();
        this.yLeftDownAngle = firstPoint.getOrdinateOy();

        this.xRightUpAngle = secoundPoint.setAbscissaOx(width);
        this.yRightUpAngle = secoundPoint.setOrdinateOy(height);

    }



    public String printCoordinatesRactangle(Rectangle rect) {
        return  "Left-Down angle: ("+rect.getXLeftDownAngle()+ ", " + rect.getYLeftDownAngle()+") " + "\r\n" +
                "Right-Down angle: ( "+ rect.getXRightUpAngle()+ ", " + rect.getYLeftDownAngle()+ ") " + "\r\n"+
                "Right-Up angle: ( "+ rect.getXRightUpAngle()+ ", " + rect.getYRightUpAngle()+ ") " + "\r\n" +
                "Left-Up angle: ( "+ rect.getXLeftDownAngle()+ ", " + rect.getYRightUpAngle()+ ") " + "\r\n";
    }


    public void moveRectangale(int newX, int newY){
        xLeftDownAngle += newX;
        yLeftDownAngle += newY;

        xRightUpAngle += newX;
        yRightUpAngle += newY;

        xRightDownAngle +=newX;
        yRightDownAngle +=newY;

        xRightUpAngle += newX;
        yRightUpAngle += newY;
    }

    public void reduceRectangle(int valueReduceX, int valueReduceY ){
        xRightDownAngle -=valueReduceX;

        xRightUpAngle -= valueReduceX;
        yRightUpAngle -= valueReduceY;

        yLeftUpAngle -= valueReduceY;
    }


    /**
     * @param rect object class Rectangle
     * @return area's rectangle
     */
    public int areaRectangle(Rectangle rect){
        return (rect.getXRightDownAngle() - rect.getXLeftDownAngle()) * (rect.getYLeftUpAngle() - rect.getYLeftDownAngle());
    }

    /**
     * @param point
     * @param rectangle
     * @return true if point is contained in rect and false if point isn't contained in rect
     */
    public boolean isPointContainedInRactangle (Point2D point, Rectangle rectangle){

        int coordPointX = point.getAbscissaOx();
        int coordPointY = point.getOrdinateOy();

        return ((coordPointX >= rectangle.getXLeftDownAngle() && coordPointX <= rectangle.getXRightDownAngle())
                &&
                (coordPointY >=rectangle.getYLeftDownAngle() && coordPointY<=rectangle.getYLeftUpAngle())
        ) ? true : false;
    }

    /**
     * @param innerRect
     * @param externalRect
     * @return true if rect is contained in other rect and false if rect isn't contained
     */
    public boolean isRectangleContainedInOtherRectangle(Rectangle innerRect, Rectangle externalRect){
        return ((innerRect.getXLeftDownAngle() >= externalRect.getXLeftDownAngle() && innerRect.getXRightDownAngle()<= externalRect.getXRightDownAngle())
                && (innerRect.getYRightUpAngle() >= externalRect.getYRightDownAngle() && innerRect.getYRightUpAngle()<=externalRect.getYRightUpAngle())
                ) ? true : false;
    }


    public boolean isRectangleCrossingWithOtherRectangle(Rectangle crossingRect, Rectangle defaultRect) {
        return (
                (crossingRect.getXLeftDownAngle() >= defaultRect.getXLeftDownAngle() && crossingRect.getXLeftDownAngle() >= defaultRect.getXRightDownAngle())
                        ||(crossingRect.getXRightDownAngle() < defaultRect.getXLeftDownAngle() )

                ) ? true : false;
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

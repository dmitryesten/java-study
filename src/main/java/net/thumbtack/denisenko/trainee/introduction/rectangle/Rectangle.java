package net.thumbtack.denisenko.trainee.introduction.rectangle;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;

import java.util.Objects;

/**
 *
 */
public class Rectangle {

    private int width;
    private int height;

    private int topLeftX;
    private int topLeftY;

    private int bottomRightX;
    private int bottomRightY;


    public Rectangle(){
        this(1, 1);
        this.topLeftX = 0;
        this.bottomRightY = 0;
    }

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.bottomRightX = bottomRightX;
        this.bottomRightY = bottomRightY;
        this.width = bottomRightX - topLeftX;
        this.height = topLeftY - bottomRightY;
    }


    public Rectangle(Point2D topLeft, Point2D bottomRight){
        this.width = bottomRight.getX() - topLeft.getX();
        this.height = topLeft.getY() - bottomRight.getY();

        this.topLeftX = topLeft.getX();
        this.topLeftY = topLeft.getY();
        this.bottomRightX = bottomRight.getX();
        this.bottomRightY = bottomRight.getY();
    }



    public Rectangle(int width, int height) {
        this.width = width;
        this.bottomRightX = width;
        this.height = height;
        this.topLeftY = height;
    }



    public static String printCoordinatesRectangle(Rectangle r) {
        return  "Left-bottom angle: ("+r.getTopLeftX()+ ", " + r.getBottomRightY()+") " + "\r\n" +
                "Right-bottom angle: ("+r.getBottomRightX()+ ", " +r.getBottomRightY()+ ") " + "\r\n"+
                "Right-Up angle: ("+ r.getBottomRightX()+ ", " +r.getTopLeftY()+ ") " + "\r\n" +
                "Left-Up angle: ("+r.getTopLeftX()+ ", " + r.getTopLeftY()+ ") " ;
    }


    public static Rectangle large (int n, Rectangle rectangle){
        rectangle.setTopLeftY(rectangle.getTopLeftY() * n);
        rectangle.setBottomRightX(rectangle.getBottomRightX() * n);
        return rectangle;
    }


    /**
     * @param rect object class Rectangle
     * @return area's rectangle
     */
    public static int areaRectangle(Rectangle rect){
        return (rect.getBottomRightX() - rect.getTopLeftX()) * (rect.getTopLeftY() - rect.getBottomRightY());
    }

    /**
     * @param point
     * @param rectangle
     * @return true if point is contained in rect and false if point isn't contained in rect
     */
    public static boolean isPointContainedInRactangle (Point2D point, Rectangle rectangle){
        return ((point.getX() >= rectangle.getTopLeftX() && point.getX() <= rectangle.getBottomRightX()) &&
                (point.getY() >=rectangle.getBottomRightY() && point.getY()<=rectangle.getTopLeftY()) );
    }


    /**
     * @param innerRect
     * @param externalRect
     * @return true if rect is contained in other rect and false if rect isn't contained
     */
    public static boolean isRectangleContainedInOtherRectangle(Rectangle innerRect, Rectangle externalRect){
        return ((innerRect.getTopLeftX() >= externalRect.getTopLeftX() && innerRect.getBottomRightX() <= externalRect.getBottomRightX())
                && (innerRect.getTopLeftY() <= externalRect.getTopLeftY() && innerRect.getBottomRightY() >= externalRect.getBottomRightY()));
    }

    private static int maxLeftX(Rectangle a, Rectangle b){
        return (a.getTopLeftX() > b.getTopLeftX()) ? a.getTopLeftX() : b.getTopLeftX();
    }

    private static int minRightX(Rectangle a, Rectangle b){
        return (a.getBottomRightX() < b.getBottomRightX()) ? a.getBottomRightX() : b.getBottomRightX();
    }

    private static int maxLeftY(Rectangle a, Rectangle b){
        return (a.getTopLeftY() > b.getTopLeftY()) ? a.getTopLeftY() : b.getTopLeftY();
    }

    private static int minRightY(Rectangle a, Rectangle b){
        return (a.getBottomRightY() < b.getBottomRightY()) ? a.getBottomRightY() : b.getBottomRightY();
    }


    public static boolean isRectangleCrossingWithOtherRectangle(Rectangle crossingRect, Rectangle defaultRect) {
        int maxLeftX = maxLeftX(crossingRect, defaultRect);
        int maxLeftY = maxLeftY(crossingRect, defaultRect);

        int minRightX = minRightX(crossingRect, defaultRect);
        int minRightY = minRightY(crossingRect, defaultRect);

        return !( (maxLeftX > minRightX) && (maxLeftY > minRightY));
    }



    public void move(int newX, int newY){
        setTopLeftX(getTopLeftX() + newX);
        setTopLeftY(getTopLeftY() + newY);
        setBottomRightX(getBottomRightX() + newX);
        setBottomRightY(getBottomRightY() + newY);
    }


    public void reduceRectangle(int valueReduceX, int valueReduceY ){
        setBottomRightX(getBottomRightX() - valueReduceX);
        setTopLeftY(getTopLeftY() - valueReduceY);
    }



    public int getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(int topLeftX) {
        this.topLeftX = topLeftX;
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(int topLeftY) {
        this.topLeftY = topLeftY;
    }

    public int getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(int bottonRightX) {
        this.bottomRightX = bottonRightX;
    }

    public int getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(int bottonRightY) {
        this.bottomRightY = bottonRightY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height &&
                topLeftX == rectangle.topLeftX &&
                topLeftY == rectangle.topLeftY &&
                bottomRightX == rectangle.bottomRightX &&
                bottomRightY == rectangle.bottomRightY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, topLeftX, topLeftY, bottomRightX, bottomRightY);
    }

    //-------------------------------------------------------------




}
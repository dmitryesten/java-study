package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;


import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import java.util.Objects;


public class Rectangle extends Figure {


	// REVU remove next 2 fields, you do not need in them
    private double width;
    private double height;

    private double topLeftX;
    private double topLeftY;

    private double bottomRightX;
    private double bottomRightY;



    public Rectangle(){
        this(1, 1);
        this.topLeftX = 0;
        this.bottomRightY = 0;
    }

    // REVU color ?

    public Rectangle(Point2D topLeft, Point2D bottomRight){
        this.width = bottomRight.getX() - topLeft.getX();
        this.height = topLeft.getY() - bottomRight.getY();

        this.topLeftX = topLeft.getX();
        this.topLeftY = topLeft.getY();
        this.bottomRightX = bottomRight.getX();
        this.bottomRightY = bottomRight.getY();
    }



    public Rectangle(double width, double height) {
        this.width = width;
        this.bottomRightX = width;
        this.height = height;
        this.topLeftY = height;
    }


    final public String printCoordinates() {
        return  "Left-bottom angle: ("+getTopLeftX()+ ", " + getBottomRightY()+") " + "\r\n" +
                "Right-bottom angle: ("+getBottomRightX()+ ", " +getBottomRightY()+ ") " + "\r\n"+
                "Right-Up angle: ("+ getBottomRightX()+ ", " +getTopLeftY()+ ") " + "\r\n" +
                "Left-Up angle: ("+getTopLeftX()+ ", " + getTopLeftY()+ ") " ;
    }


    // REVU You do not need to pass Rectangle rectangle as parameter
    // instead, create it inside "large"
    public static Rectangle large (int n, Rectangle rectangle){
        rectangle.setTopLeftY(rectangle.getTopLeftY() * n);
        rectangle.setBottomRightX(rectangle.getBottomRightX() * n);
        return rectangle;
    }


    /**
     * @return area's rectangle
     */
    public double area(){
        return (getBottomRightX() - getTopLeftX()) * (getTopLeftY() - getBottomRightY());
    }



    /**
     * @param point(x, y)
     * @return true if point is contained in rect and false if point isn't contained in rect
     */
    @Override
    public boolean isPointInFigure(Point2D point) {
        return ((point.getX() >= getTopLeftX() && point.getX() <= getBottomRightX()) &&
                (point.getY() >= getBottomRightY() && point.getY() <= getTopLeftY()) );
    }

    public boolean isPointInFigure(int pointX, int pointY) {
        return ((pointX >= getTopLeftX() && pointX <= getBottomRightX()) &&
                (pointY >= getBottomRightY() && pointY <= getTopLeftY()) );
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

    private static double maxLeftX(Rectangle a, Rectangle b){
        return (a.getTopLeftX() > b.getTopLeftX()) ? a.getTopLeftX() : b.getTopLeftX();
    }

    private static double minRightX(Rectangle a, Rectangle b){
        return (a.getBottomRightX() < b.getBottomRightX()) ? a.getBottomRightX() : b.getBottomRightX();
    }

    private static double maxLeftY(Rectangle a, Rectangle b){
        return (a.getTopLeftY() > b.getTopLeftY()) ? a.getTopLeftY() : b.getTopLeftY();
    }

    private static double minRightY(Rectangle a, Rectangle b){
        return (a.getBottomRightY() < b.getBottomRightY()) ? a.getBottomRightY() : b.getBottomRightY();
    }


    public static boolean isRectangleCrossingWithOtherRectangle(Rectangle crossingRect, Rectangle defaultRect) {
        double maxLeftX = maxLeftX(crossingRect, defaultRect);
        double maxLeftY = maxLeftY(crossingRect, defaultRect);

        double minRightX = minRightX(crossingRect, defaultRect);
        double minRightY = minRightY(crossingRect, defaultRect);

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



    public double getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(double topLeftX) {
        this.topLeftX = topLeftX;
    }

    public double getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(double topLeftY) {
        this.topLeftY = topLeftY;
    }

    public double getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(double bottonRightX) {
        this.bottomRightX = bottonRightX;
    }

    public double getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(double bottonRightY) {
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

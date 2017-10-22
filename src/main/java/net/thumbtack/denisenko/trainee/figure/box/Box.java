package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.interfaces.Square;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;


public class Box <T extends Figure> implements Square<Rectangle> {

    private T content;

    public Box(T content){
        this.content = content;
    }


    public T create(T b) throws IllegalAccessException, InstantiationException {
        Class c = b.getClass();
        return (T) c.newInstance();
    }


    @Override
    public double square() {
       return content.area();
    }


    public <T extends Figure>  boolean isSameSquare(Box<Circle> box2){
        return FloatingOperations.compareValues(square(), box2.square());
    }


    public T getContent() {
        return content;
    }


    public void setContent(T content) {
        this.content = content;
    }


    public static <T extends Figure>  boolean isSameSquareStatic(Box box1, Box box2){
        return FloatingOperations.compareValues(box1.square(), box2.square());
    }


}

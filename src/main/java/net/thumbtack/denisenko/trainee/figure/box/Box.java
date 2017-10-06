package net.thumbtack.denisenko.trainee.figure.box;


import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;

public class Box <T extends Rectangle & Square> implements Square{

    private T content;

    public Box(T content){
        this.content = content;
    }


    public T create(Box<?> b) throws IllegalAccessException, InstantiationException {
        Class c = b.getClass();
        return (T) c.newInstance();
    }


    public double square() {
       return content.area();
    }
/*
    public static boolean isSameSquare(T box, T box2){
        return FloatingOperations.compareValues(square(box), box.square(box));
    }
*/
    public <T extends Rectangle & Square>  boolean isSameSquare(T box2){
        return FloatingOperations.compareValues(square(), box2.square());
    }


    public T getContent() {
        return content;
    }


    public void setContent(T content) {
        this.content = content;
    }

}

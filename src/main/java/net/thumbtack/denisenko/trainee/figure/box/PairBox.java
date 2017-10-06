package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;

public class PairBox<T extends Figure, V extends Figure>{

    private T contentRect;
    private V contentCircle;

    public PairBox(T contentRect, V contentCircle){
        this.contentRect = contentRect;
        this.contentCircle = contentCircle;
    }

    public boolean isSameSquare(T contentRect, V contentCircle){
        return FloatingOperations.compareValues(contentRect.area(), contentCircle.area());
    }


    public T getContentRect() {
        return contentRect;
    }

    public void setContentRect(T contentRect) {
        this.contentRect = contentRect;
    }

    public V getContentCircle() {
        return contentCircle;
    }

    public void setContentCircle(V contentCircle) {
        this.contentCircle = contentCircle;
    }

}

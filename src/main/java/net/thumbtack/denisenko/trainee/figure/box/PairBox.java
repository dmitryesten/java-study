package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

public class PairBox<T extends Rectangle, V extends Circle> {

    private T contentRect;
    private V contentCircle;

    public PairBox(T contentRect, V contentCircle){
        this.contentRect = contentRect;
        this.contentCircle = contentCircle;
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

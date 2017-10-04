package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry2D.Point2D;
import net.thumbtack.denisenko.trainee.figure.geometry2D.Rectangle;

public class Box <T extends Rectangle> {

    private T content;

    Box(T content){
        this.content = content;
    }

    public Rectangle create(){
        return new Rectangle();
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Rectangle create(Point2D leftTop, Point2D bottomRight){
        return new Rectangle(leftTop, bottomRight);
    }

    public Rectangle create(int wight, int height){
        return new Rectangle(wight, height);
    }

    public double square(){
        return content.area();
    }

}

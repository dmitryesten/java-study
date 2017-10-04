package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry2D.Rectangle;

public class Box <T extends Rectangle> {

    private T content;

    Box(T content){
        this.content = content;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}

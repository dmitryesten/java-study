package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

public class NamedArrayBox<T> extends ArrayBox<Rectangle>{

    private String nameBox;

    public NamedArrayBox(Rectangle[] content) {
        super(content);
    }

    public String getNameBox() {
        return nameBox;
    }

    public void setNameBox(String nameBox) {
        this.nameBox = nameBox;
    }

}

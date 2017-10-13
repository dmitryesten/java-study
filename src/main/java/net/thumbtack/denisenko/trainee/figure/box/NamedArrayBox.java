package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

// REVU ArrayBox is a raw type. References to generic type ArrayBox<T> should be parameterized
public class NamedArrayBox<T> extends ArrayBox {

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

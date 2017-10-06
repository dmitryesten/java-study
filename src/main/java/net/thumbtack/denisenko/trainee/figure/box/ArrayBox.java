package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

public class ArrayBox<T extends Rectangle> {

    private T [] content;

    public ArrayBox(T [] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    public T[] create(ArrayBox<?>[] arrayBoxes) throws IllegalAccessException, InstantiationException {
        Class c = arrayBoxes.getClass();
        return (T[]) c.newInstance();
    }
}

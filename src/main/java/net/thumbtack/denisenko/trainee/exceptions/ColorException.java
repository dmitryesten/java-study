package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.figure.Color;

public class ColorException extends Exception {

    private Color color;

    public ColorException(String message, Color color){
        super(message);
        this.color = color;
    }

    public ColorException(String message){
        super(message);
        this.color = color;
    }

    public ColorException(String message, Throwable cause, Color color) {
        super(message, cause);
        this.color = color;
    }

    public ColorException(Throwable cause, Color color) {
        super(cause);
        this.color = color;
    }




    public Color getColor() {
        return color;
    }

}

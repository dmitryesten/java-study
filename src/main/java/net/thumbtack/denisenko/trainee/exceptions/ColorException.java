package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.figure.Color;

public class ColorException extends Exception {

    private String color = "";


    public ColorException(String message, String color){
        super(message);
        this.color = color;
    }


    public ColorException(String message){
        super(message);
        this.color = color.toString();
    }


    public ColorException(String message, Throwable cause, String color) {
        super(message, cause);
        this.color = color;
    }

    public ColorException(Throwable cause, String color) {
        super(cause);
        this.color = color;
    }

    public ColorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String color) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

}

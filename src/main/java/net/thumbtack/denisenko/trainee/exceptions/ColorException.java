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


    public String getColor() {
        return color;
    }

}

package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;

public enum Color {
    RED, GREEN, BLUE, YELLOW, WHITE, BLACK;

    public static Color colorFromString(String strColor) throws ColorException {
        try {
            return Color.valueOf(strColor.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new ColorException("Error print color");
        }
    }

}

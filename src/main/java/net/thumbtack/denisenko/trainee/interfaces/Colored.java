package net.thumbtack.denisenko.trainee.interfaces;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;

public interface Colored {

    String getColor();

    void setColor(Color color);
    void setColor(String color) throws ColorException;

}

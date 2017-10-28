package net.thumbtack.denisenko.trainee.interfaces;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.enums.Color;

public interface Colored {

    Color getColor();

    void setColor(Color color);
    void setColor(String color) throws ColorException;

}

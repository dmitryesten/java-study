package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;

public interface Colored {

    String getColor();

    void setColor(Color color);
    void setColor(String color) throws ColorException;

}

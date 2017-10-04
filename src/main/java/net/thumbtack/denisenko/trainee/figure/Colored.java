package net.thumbtack.denisenko.trainee.figure;

public interface Colored {

    int color = 777;
    default int paint(){
        return color;
    }

}

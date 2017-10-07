package net.thumbtack.denisenko.trainee.figure;

public interface Colored {

    default Color paint(Color color){
        return color;
    }


}

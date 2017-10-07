package net.thumbtack.denisenko.trainee.figure;

public interface Colored {

	// REVU it is good that you know "default" method but it is not a good idea tou use it here. Remove color 
    int color = 777;
    // REVU you must have getColor and setColor
    default int paint(){
        return color;
    }

}

package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.trainee.TraineeErrorCodes;

public class TraineeException extends Exception {

    private String fieldTrainee;
    private int number;

    public TraineeException(){
        super("The parametres instance is not correct");
    }

    public TraineeException(String filedTrainee){
        super("String is empty or null");
        this.fieldTrainee = filedTrainee;
    }

    public TraineeException(TraineeErrorCodes number){
        super("The number is not correct");
        //this.number = number;
    }



}

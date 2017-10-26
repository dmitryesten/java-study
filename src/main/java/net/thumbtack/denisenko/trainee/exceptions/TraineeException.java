package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.trainee.TraineeErrorCodes;

public class TraineeException extends Exception {

    private String fieldTrainee;
    private int number;
    private Trainee [] trainees;

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

    public TraineeException(Trainee [] trainees){
        super("The array is null or empty");

    }



}

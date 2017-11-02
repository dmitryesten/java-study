package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.enums.TraineeErrorCodes;

public class TraineeException extends Exception {

    private String field;
    private int number;
    private Trainee [] trainees;

    public TraineeException(){
        super("The parametres instance is not correct");
    }

    public TraineeException(String filed){
        super("String is empty or null");
        this.field = filed;
    }

    public TraineeException(TraineeErrorCodes traineeExc){
        super(traineeExc.toString());
    }

    public TraineeException(int number){
        super("The number is not correct");
        this.number = number;
    }

    public TraineeException(Trainee [] trainees){
        super("The array is null or empty");

    }



}

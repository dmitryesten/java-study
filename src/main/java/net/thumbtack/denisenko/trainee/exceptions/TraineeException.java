package net.thumbtack.denisenko.trainee.exceptions;

public class TraineeException extends Exception {

    private String fieldTrainee;

    public TraineeException(){
        super("The field is not correct");
    }

    public TraineeException(String filedTrainee){
        super("The field is not correct");
        this.fieldTrainee = filedTrainee;
    }



}

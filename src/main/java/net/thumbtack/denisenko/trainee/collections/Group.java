package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.trainee.TraineeErrorCodes;

public class Group {

    private String name;
    private Trainee [] trainees;


    public Group(String nameGroup, Trainee [] trainee) {
        try {
            setName(nameGroup); setTrainees(trainee);
        } catch (TraineeException e) {
            e.printStackTrace();
        }

    }


    public String getName() {
        return name;
    }

    public Trainee[] getTrainees() {
        return trainees;
    }


    public void setName(String name) throws TraineeException {
        if (name == null || name.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.name = name;
    }

    public void setTrainees(Trainee[] trainees) throws TraineeException {
        if (trainees == null || trainees.length == 0)
            throw new TraineeException(trainees);
        this.trainees = trainees;
    }
}

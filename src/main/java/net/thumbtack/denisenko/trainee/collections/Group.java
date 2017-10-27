package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.trainee.TraineeErrorCodes;

public class Group {

	// REVU simply "name"
    private String nameGroup;
    private Trainee [] trainees;


    public Group(String nameGroup, Trainee [] trainee) throws TraineeException {
        setNameGroup(nameGroup);
        setTrainees(trainee);
    }


    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) throws TraineeException {
    	// REVU ||, not &&
        if (nameGroup == null && nameGroup.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.nameGroup = nameGroup;
    }

    public Trainee[] getTrainees() {
        return trainees;
    }

    public void setTrainees(Trainee[] trainees) throws TraineeException {
        if (trainees == null || trainees.length == 0)
            throw new TraineeException(trainees);
        this.trainees = trainees;
    }
}

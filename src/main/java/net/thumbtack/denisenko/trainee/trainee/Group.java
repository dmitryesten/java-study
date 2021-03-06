// REVU move to another package
package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.enums.TraineeErrorCodes;

public class Group  {

    private String name;
    private Trainee [] trainees;


    public Group(String nameGroup, Trainee [] trainee) throws TraineeException {
            setName(nameGroup);
            setTrainees(trainee);
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

    @Override
    public String toString() {
        return "name=" + this.name + ", trainees=" + this.trainees + "\r\n";
    }



}

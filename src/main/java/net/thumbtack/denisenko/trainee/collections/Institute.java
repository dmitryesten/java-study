package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.TraineeErrorCodes;

public class Institute {

    private String name;
    private String city;

    public Institute(String name, String city) throws TraineeException {
        setName(name);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws TraineeException {
        if (city == null && city.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws TraineeException {
        if (city == null && city.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.city = city;
    }


}

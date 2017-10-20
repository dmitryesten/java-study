package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;


public class Trainee {

    private String name;
    private String surname;
    private int rating;


    public Trainee(String name, String surname, int rating) throws TraineeException {
       setName(name);
       setSurname(surname);
       setRating(rating);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) throws NullPointerException, TraineeException {
        try {
            if (name != null && !name.isEmpty())
                this.name = name;
            // let us discuss at Sunday

        }catch (IllegalArgumentException e){
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        }
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) throws TraineeException {
        try {
            if (name != null && !name.isEmpty())
                this.surname = surname;
        }catch (IllegalArgumentException e){
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        }
    }


    public int getRating() {
        return rating;
    }


    public void setRating(int rating) throws TraineeException {
        try {
            if(rating >= 1 && rating <= 5)
                this.rating = rating;
        }catch (IllegalArgumentException e){
            throw new TraineeException(TraineeErrorCodes.ERROR_NUMBER_IS_NOT_CORRECT);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        if (rating != trainee.rating) return false;
        if (!name.equals(trainee.name)) return false;
        return surname.equals(trainee.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + rating;
        return result;
    }
}

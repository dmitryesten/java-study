package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.enums.TraineeErrorCodes;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;


public class Trainee implements Serializable, Comparable<Trainee>{

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


    public void setName(String name) throws TraineeException {
        if (name == null || name.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) throws TraineeException {
        if (surname == null || surname.isEmpty())
            throw new TraineeException(TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY);
        this.surname = surname;
    }


    public int getRating() {
        return rating;
    }


    public void setRating(int rating) throws TraineeException {
        if(rating >= 1 && rating <= 5)
            this.rating = rating;
        else throw new TraineeException(TraineeErrorCodes.ERROR_NUMBER_IS_NOT_CORRECT);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainee)) return false;
        Trainee trainee = (Trainee) o;
        return rating == trainee.rating &&
                Objects.equals(name, trainee.name) &&
                Objects.equals(surname, trainee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, rating);
    }


    @Override
    public String toString() {
        return "name=" + this.name + ", surname=" + this.surname + ", rating=" + this.rating + "\r\n";
    }



    public static Comparator<Trainee> RatingComparator = new Comparator<Trainee>() {
        @Override
        public int compare(Trainee e1, Trainee e2) {
            return e1.getRating() - e2.getRating();
        }
    };

    public static Comparator<Trainee> NameComparator = new Comparator<Trainee>() {
        @Override
        public int compare(Trainee e1, Trainee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static Comparator<Trainee> SurnameComparator = new Comparator<Trainee>() {
        @Override
        public int compare(Trainee e1, Trainee e2) {
            return e1.getSurname().compareTo(e2.getSurname());
        }
    };


    @Override
    public int compareTo(Trainee o) {
        return getName().compareTo(o.getName());
    }
}

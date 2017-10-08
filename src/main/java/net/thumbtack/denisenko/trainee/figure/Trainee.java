package net.thumbtack.denisenko.trainee.figure;


import net.thumbtack.denisenko.trainee.exceptions.TraineeException;


public class Trainee {

    private String name;
    private String surname;
    private int rating;


    public Trainee(String name, String surname, int rating) throws TraineeException {
        if(name.equals(""))
            throw new TraineeException();
        else
            this.name = name;

        this.surname = surname;

        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws TraineeException {
        try {
            this.name = name;
        }catch (IllegalArgumentException ex){
            if(name.equals(null) && name.equals(""))
                throw new TraineeException();
        }

    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}

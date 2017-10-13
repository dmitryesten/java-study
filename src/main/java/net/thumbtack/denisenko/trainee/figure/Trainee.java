package net.thumbtack.denisenko.trainee.figure;


import net.thumbtack.denisenko.trainee.exceptions.TraineeException;

// REVU why trainee in "figure" package ?
public class Trainee {

    private String name;
    private String surname;
    private int rating;


    public Trainee(String name, String surname, int rating) throws TraineeException {

    	// REVU call setName
        if( name == null && "".equals(name.trim()))
            throw new TraineeException();
        // REVU else is unnecessary here
        else { this.name = name; }


        if( surname == null && "".equals(surname.trim()))
            throw new TraineeException("String is empty or null");
        else { this.surname = surname; }


        if(rating >= 1 && rating <= 5)
            this.rating = rating;
        else throw new TraineeException();
    }



    public String getName() {
        return name;
    }



    public void setName(String name) throws TraineeException {
        try {
            this.name = name;
            // REVU you can't get IllegalArgumentException here. 
            // You must check before assignment
        }catch (IllegalArgumentException ex){
            if(name == null && "".equals(name.trim()) )
                throw new TraineeException();
        }
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) throws TraineeException {
        try {
            this.surname = surname;
            // REVU you can't get IllegalArgumentException here. 
            // You must check before assignment
        }catch (IllegalArgumentException ex){
            if(surname == null && "".equals(surname.trim()))
                throw new TraineeException(surname);
        }

    }


    public int getRating() {
        return rating;
    }


    public void setRating(int rating) throws TraineeException {
        try {
            this.rating = rating;
            // REVU you can't get IllegalArgumentException here. 
            // You must check before assignment
        }catch (IllegalArgumentException ex){
            if(rating >= 1 && rating <= 5)
                throw new TraineeException(rating);
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

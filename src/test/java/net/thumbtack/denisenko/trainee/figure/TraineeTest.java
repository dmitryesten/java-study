package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeTest {

    Trainee trainee = new Trainee("","s", 1);

    public TraineeTest() throws TraineeException {

    }


    @Ignore
    public void set() throws Exception {
        try {
            assertNotEquals("", trainee.getName() );
        }
        catch (IllegalArgumentException ex){
            throw new TraineeException();
        }
    }



}
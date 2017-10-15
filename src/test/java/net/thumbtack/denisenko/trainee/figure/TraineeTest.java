package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeTest {

    Trainee trainee;

    public TraineeTest() throws TraineeException {

    }


    @Test
    public void set() throws Exception {
        String name = null;
        String surname = null;
        int number = 4;

        try {
            trainee = new Trainee(name, surname, number);
        }catch(NullPointerException e){
            throw new TraineeException();
        }

        try {
            assertEquals("", trainee.getName());
            assertEquals(null, trainee.getName());
        }
        catch(NullPointerException np){
            np.printStackTrace();
            //throw new TraineeException ();
        }
        catch(IllegalArgumentException ex){
            throw new TraineeException ();
        }

    }



}
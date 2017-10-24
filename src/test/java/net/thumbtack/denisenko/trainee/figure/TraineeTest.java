package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.trainee.Trainee;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeTest {

    private Trainee trainee = new Trainee("Ivan", "Ivanov", 3);

    public TraineeTest() throws TraineeException {

    }

    @Test
    public void getName() throws Exception {
        assertEquals("Ivan", trainee.getName());
    }

    @Test
    public void getSurname() throws Exception {
        assertEquals("Ivanov", trainee.getSurname());
    }

    @Test
    public void getRating() throws Exception {
        assertEquals(3, trainee.getRating());
    }



}
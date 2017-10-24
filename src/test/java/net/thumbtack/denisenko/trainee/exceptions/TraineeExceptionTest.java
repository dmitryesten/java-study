package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeExceptionTest {

    @Test(expected = TraineeException.class)
    public void testRating() throws TraineeException {
        Trainee trainee = new Trainee("Vasia", "Ivanov", 7);
    }

    @Test(expected = NullPointerException.class)
    public void testName() throws TraineeException {
        Trainee trainee = new Trainee(null, "Ivanov", 7);
    }

    @Test(expected = NullPointerException.class)
    public void testSurname() throws TraineeException {
        Trainee trainee = new Trainee("Petro", null, 7);
    }

    @Test(expected = TraineeException.class)
    public void testEmty() throws TraineeException {
        Trainee trainee = new Trainee("", "", 7);
    }



}
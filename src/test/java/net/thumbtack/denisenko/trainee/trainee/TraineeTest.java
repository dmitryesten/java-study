package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeTest {

    private Trainee source = new Trainee("Vasia", "Pupkin", 4);

    public TraineeTest() throws TraineeException {}

    @Test(expected = NullPointerException.class)
    public void getName() throws Exception {
        assertEquals("Vasia", source.getName());
        source.setName("");
        assertEquals("", source.getName());
        source.setName(null);
        assertEquals(null, source.getName());
    }


    @Test(expected = NullPointerException.class)
    public void getSurname() throws Exception {
        assertEquals("Pupkin", source.getSurname());
        source.setSurname("");
        assertEquals("", source.getSurname());
        source.setSurname(null);
        assertEquals(null, source.getSurname());
    }


    @Test(expected = TraineeException.class)
    public void getRating() throws Exception {
        assertEquals(4, source.getRating());
        source.setRating(-20);
        assertEquals(-20, source.getRating());
        source.setRating(15);
        assertEquals(15, source.getRating());
    }


    @Test
    public void compareTo() throws Exception {
        Trainee t2 = new Trainee("Vasia", "q123", 1);
        assertEquals(0, source.compareTo(t2));
        t2.setName("e12");
        assertTrue( source.compareTo(t2) < 0 ? true : false);
    }

}
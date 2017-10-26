package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstituteTest {

    public InstituteTest() throws TraineeException {
    }

    @Test(expected = NullPointerException.class)
    public void getName() throws Exception {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("MSU", institute.getName());
        institute.setName(null);
        assertEquals(null, institute.getName());
        institute.setName("");
        assertEquals("", institute.getName());
    }

    @Test(expected = NullPointerException.class)
    public void getCity() throws Exception {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("Moscow", institute.getCity());
            institute.setName(null);
        assertEquals(null, institute.getCity());
            institute.setName("");
        assertEquals("", institute.getCity());
    }

}
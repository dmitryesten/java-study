package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstituteTest {

    @Test(expected = TraineeException.class)
    public void getNullName() throws Exception {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("MSU", institute.getName());
        institute.setName(null);
        assertEquals(null, institute.getName());
    }


    @Test(expected = TraineeException.class)
    public void getEmptyName() throws TraineeException {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("MSU", institute.getName());
        institute.setName("");
        assertEquals("", institute.getName());
    }

    @Test(expected = TraineeException.class)
    public void getNullCity() throws Exception {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("Moscow", institute.getCity());
            institute.setName(null);
        assertEquals(null, institute.getCity());
    }


    @Test(expected = TraineeException.class)
    public void getEmptyCity() throws Exception {
        Institute institute = new Institute("MSU", "Moscow");
        assertEquals("Moscow", institute.getCity());
        institute.setName("");
        assertEquals("", institute.getCity());
    }


}
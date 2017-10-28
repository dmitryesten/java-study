package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupTest {
    @Test(expected = TraineeException.class)
    public void getNullName() throws Exception {
        Group group = new Group("PIN131",new Trainee[5]);
        assertEquals("PIN131", group.getName());
        group.setName(null);
        assertEquals(null, group.getName());
    }

    @Test(expected = TraineeException.class)
    public void getEmptyName() throws Exception {
        Group group = new Group("PIN131",new Trainee[5]);
        assertEquals("PIN131", group.getName());
        group.setName(null);
        assertEquals(null, group.getName());
    }

    @Test
    public void getNullTrainees() throws Exception {
        Group group = new Group("PIN131",new Trainee[5]);
        assertEquals("PIN131", group.getTrainees());
        //group.setTrainees(null);
        //assertEquals(null, group.getTrainees());
    }

    @Test(expected = TraineeException.class)
    public void getEmptyTrainees() throws Exception {
    }

}
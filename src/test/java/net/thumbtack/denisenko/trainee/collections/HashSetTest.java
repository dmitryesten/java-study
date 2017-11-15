package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Task_6.12
 */
public class HashSetTest {

    private Set<Trainee> hashSetTrainee = new HashSet<>();

    @Test
    public void testContains() throws TraineeException {
        hashSetTrainee.add(new Trainee("Malder", "Fox", 5));
        hashSetTrainee.add(new Trainee("John", "Walk", 3));
        hashSetTrainee.add(new Trainee("Dana", "Scully", 4));

        assertTrue(hashSetTrainee.contains(new Trainee("John", "Walk", 3)));
        assertFalse(hashSetTrainee.contains(new Trainee("Angela","Qwerty", 2)));

    }

}

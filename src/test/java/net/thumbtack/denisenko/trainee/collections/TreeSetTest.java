package net.thumbtack.denisenko.trainee.collections;

import javafx.print.Collation;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    private Set<Trainee> set = new TreeSet<>();

    @Test
    public void testContains() throws TraineeException {
         set.add(new Trainee("Mary", "Adames", 3));
         set.add(new Trainee("Rock", "Talles",2));
         set.add(new Trainee("Aline", "Crack", 5));
        Assert.assertTrue("Yes, TreeSet has the object",set.contains(new Trainee("Rock", "Talles",2)));
        Assert.assertTrue(set.contains(new Trainee("Rock", "Sharp",2)));
    }

}

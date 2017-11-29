package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Institute;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;


public class HashMapTest {


    private Trainee trainee1 = new Trainee("Cherry","Berry", 4);
    private Trainee trainee2 = new Trainee("May","Tray", 5);
    private Trainee trainee3 = new Trainee("Losy","Erfa", 2);
    private Institute institute1 = new Institute("Oxford University", "Oxford, UK");
    private Institute institute2 = new Institute("Yale University", "New Haven, Connecticut");

    private Map map = new HashMap<Trainee, Institute>();

    public HashMapTest() throws TraineeException {
    }


    @Before
    public void setUp() throws TraineeException {
        map.put(trainee1, institute1);
        map.put(trainee2, institute2);
        map.put(trainee3, institute1);
    }


    @Test
    public void testGetValue(){
       assertEquals(institute1, map.get(trainee1));
       assertEquals(institute2, map.get(trainee2));
    }

    @Test
    public void testPrintAllKeys(){
        Set<Trainee> expected = new HashSet<>();
        expected.add(trainee1); expected.add(trainee2); expected.add(trainee3);
        Set<Trainee> set = map.keySet();

        assertEquals(expected, map.keySet());

    }






}

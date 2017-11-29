package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Institute;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeMapTest {

    private TreeMap<Trainee, Institute> treeMap = new TreeMap<>();

    private Trainee trainee1 = new Trainee("Cherry","Berry", 4);
    private Trainee trainee2 = new Trainee("May","Tray", 5);
    private Trainee trainee3 = new Trainee("Losy","Erfa", 2);
    private Institute institute1 = new Institute("Oxford University", "Oxford, UK");
    private Institute institute2 = new Institute("Yale University", "New Haven, Connecticut");

    public TreeMapTest() throws TraineeException {}

    @Before
    public void setUp() throws TraineeException {
        treeMap.put(trainee1, institute1);
        treeMap.put(trainee2, institute2);
        treeMap.put(trainee3, institute1);
    }


    @Test
    public void testGetValue() {
        assertEquals(institute2, treeMap.get(trainee2));
    }

    @Test
    public void testGetAllKeys() {
        Set<Trainee> excepted = new HashSet<>();
        excepted.add(trainee1);
        excepted.add(trainee3);
        excepted.add(trainee2);

        Set<Trainee> setKeys = treeMap.keySet();
        assertEquals(excepted, setKeys);
    }

    @Test
    public void testGetPairKV() {
        Set setKeys = treeMap.entrySet();
        System.out.println(setKeys);
        /*for(Map.Entry e : treeMap.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }*/
    }

    @Test
    public void testTreeMapSort() throws TraineeException {
        TreeMap<Trainee,Institute> treeMapSortName = new TreeMap<>(Trainee.NameComparator);
        treeMapSortName.put(trainee2, institute2);
        //treeMapSortName.put(trainee3, institute1);
        treeMapSortName.put(trainee1, institute1);
        treeMapSortName.put(new Trainee("Aline", "Forse",1), institute1);

        assertTrue(treeMapSortName.containsKey(new Trainee("Aline", "Yorter",1)));
        assertFalse(treeMapSortName.containsKey(trainee3));
    }

    @Test
    public void testAllSortedKeys() throws TraineeException {
        TreeMap<Trainee,Institute> treeMapSortName = new TreeMap<>(Trainee.NameComparator);
        treeMapSortName.put(trainee2, institute2);
        //treeMapSortName.put(trainee3, institute1);
        treeMapSortName.put(trainee1, institute1);
        treeMapSortName.put(new Trainee("Aline", "Forse",1), institute1);

        Set<Trainee> setKeys = treeMapSortName.keySet();
        System.out.println(setKeys);
    }

    @Test
    public void testAllSortedPaiirKV() throws TraineeException {
        TreeMap<Trainee,Institute> treeMapSortName = new TreeMap<>(Trainee.NameComparator);
        treeMapSortName.put(trainee2, institute2);
        //treeMapSortName.put(trainee3, institute1);
        treeMapSortName.put(trainee1, institute1);
        treeMapSortName.put(new Trainee("Aline", "Forse",1), institute1);

        Set setKeys = treeMapSortName.entrySet();
        System.out.println(setKeys);
    }


}

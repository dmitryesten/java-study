package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.BitSet;
import java.util.Random;

public class BitSetTest {

    private BitSet bitSet = new BitSet();

    @Before
    public void setUp() throws TraineeException {
        Random random = new Random();
        for (int i = 0; i < 8 ; i++) {
            bitSet.set(i*2);
        }

    }


    @Test
    public void testSet(){
        bitSet.set(12);
        Assert.assertTrue(bitSet.get(12));
    }

    @Test
    public void testGet(){
        Assert.assertFalse(bitSet.get(50));
    }

    @Test
    public void testClear(){
        bitSet.clear(2);
        Assert.assertFalse(bitSet.get(2));
    }

}

package net.thumbtack.denisenko.trainee.introduction.task3;

import net.thumbtack.denisenko.trainee.introduction.task3.FloatingOperations;
import org.junit.Test;

import static org.junit.Assert.*;


public class FloatingOperationsTest {
    FloatingOperations elemOperFloatingNumbers = new FloatingOperations();

    @Test
    public void add() throws Exception {
        assertEquals(7.846800000000001E-11, elemOperFloatingNumbers.add(0.000000000000008, 0.00000000007846), 0.000001);
    }


    @Test
    public void multiplication() throws Exception {
        assertEquals(6.276800000000001E-25, elemOperFloatingNumbers.multiplication(0.000000000000008, 0.00000000007846), 0.000001);
    }



    @Test
    public void compareValues() throws Exception {
        assertEquals(0.00000000001, elemOperFloatingNumbers.compareValues(0.00000000001, 0.00000000001), 0.00000000001 );
        assertEquals(0.00000070, elemOperFloatingNumbers.compareValues(0.00000074, 0.0000007), 0.000000001);
        assertEquals(0.00000074, elemOperFloatingNumbers.compareValues(0.000070, 0.00000074), 0.0000001);

    }




}
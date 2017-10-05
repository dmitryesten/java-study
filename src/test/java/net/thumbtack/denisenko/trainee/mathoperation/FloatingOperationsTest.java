package net.thumbtack.denisenko.trainee.mathoperation;


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
        assertTrue(FloatingOperations.compareValues(0.0078, 0.0078));
        assertFalse(FloatingOperations.compareValues(0.0078, 0.00078));
    }




}
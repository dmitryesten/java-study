package net.thumbtack.denisenko.trainee.introduction;

import org.junit.Test;

import static org.junit.Assert.*;

// REVU too long name
public class OperationsAboveFloatingNumbersTest {
    OperationsAboveFloatingNumbers elemOperFloatingNumbers = new OperationsAboveFloatingNumbers();

    @Test
    public void add() throws Exception {
        assertEquals(7.846800000000001E-11, elemOperFloatingNumbers.add(0.000000000000008, 0.00000000007846), 0.000001);
    }

    @Test
    public void multiplication() throws Exception {
        assertEquals(6.276800000000001E-25, elemOperFloatingNumbers.multiplication(0.000000000000008, 0.00000000007846), 0.000001);
    }

  // REVU test fails
    @Test
    public void compareValues() throws Exception {
        double comparingValueOne = 0.0000000008;
        double comparingValueTwo = 0.00000000009;
        double comparingValueOneForLess = 0.0000000008;
        double comparingValueTwoForLess = 0.00000000009;
        assertEquals("Два числа равны", elemOperFloatingNumbers.compareValues(4, 4));
        assertEquals(comparingValueTwo + " больше, чем "+ comparingValueOne, elemOperFloatingNumbers.compareValues(comparingValueOne, comparingValueTwo));
        assertEquals(comparingValueTwoForLess + " менььше, чем "+ comparingValueOneForLess, elemOperFloatingNumbers.compareValues(comparingValueOneForLess, comparingValueTwoForLess));

    }

}
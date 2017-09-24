package net.thumbtack.denisenko.trainee.introduction.task2;


import static org.junit.Assert.*;

import net.thumbtack.denisenko.trainee.introduction.task2.MathOperation;
import org.junit.Assert;
import org.junit.Test;



public class MathOperationTest {

    private MathOperation elementaryMathOperation = new MathOperation();

    @Test
    public void testAdder() {
        assertEquals(4, elementaryMathOperation.adder(2, 2));
        assertEquals(0, elementaryMathOperation.adder(2, -2));
        assertEquals(0, elementaryMathOperation.adder(-2, 2));
        assertEquals(-4, elementaryMathOperation.adder(-2, -2));
        assertNotEquals(1, elementaryMathOperation.adder(0, 0));
    }

    @Test
    public void testMulty(){
        assertEquals(4, elementaryMathOperation.multy(2,2));
        assertEquals(-4, elementaryMathOperation.multy(2, -2));
        assertEquals(-4, elementaryMathOperation.multy(-2, 2));
        assertEquals(4, elementaryMathOperation.multy(-2, -2));
        assertEquals(0, elementaryMathOperation.multy(2, 0));
    }

    @Test
    public void testDivision() throws ArithmeticException{
        assertEquals(2, elementaryMathOperation.devision(4,2));
        assertEquals(-2, elementaryMathOperation.devision(4,-2));
        assertEquals(-2, elementaryMathOperation.devision(-4,2));
        assertEquals(2, elementaryMathOperation.devision(-4,-2));

        assertEquals(0, elementaryMathOperation.devision(0,-2));
        assertEquals(0, elementaryMathOperation.devision(0,2));

        //assertEquals("На 0 делить нельзя", elementaryMathOperation.devision(4,0));

    }


    @Test
    public void testRemainderOfDivision() throws ArithmeticException{
        try{
            assertEquals(2, elementaryMathOperation.remainderOfDivision(8,3), 0.000001);
            assertEquals(2, elementaryMathOperation.remainderOfDivision(8,3), 0.000001);
            assertEquals(2, elementaryMathOperation.remainderOfDivision(8,3), 0.000001);
            assertEquals(-2, elementaryMathOperation.remainderOfDivision(-8,3), 0.000001);
            assertEquals(2, elementaryMathOperation.remainderOfDivision(8,-3), 0.000001);
        }catch (ArithmeticException e){
            Assert.fail("Division zero is fail");
        }


    }


    @Test
    public void testCompareValues(){
        assertEquals(4, elementaryMathOperation.compareValues(4, 4), 0.00000001);
        assertEquals(2, elementaryMathOperation.compareValues(4, 2), 0.00000001);
        assertEquals(2, elementaryMathOperation.compareValues(2, 4), 0.00000001);
    }


    }

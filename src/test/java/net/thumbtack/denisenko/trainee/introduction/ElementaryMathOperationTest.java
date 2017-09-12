package net.thumbtack.denisenko.trainee.introduction;

// REVU remove
import jdk.nashorn.internal.ir.annotations.Ignore;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

// REVU 4 tests from 5 fail
public class ElementaryMathOperationTest {
	// REVU private
    ElementaryMathOperation elementaryMathOperation = new ElementaryMathOperation();

    @Test
    public void testAdder() {
        assertEquals(4, elementaryMathOperation.adder(2, 2));
        assertEquals(2, elementaryMathOperation.adder(2, -2));
        assertEquals(2, elementaryMathOperation.adder(-2, 2));
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
    public void testDevision() throws ArithmeticException{
        assertEquals("2", elementaryMathOperation.devision(4,2));
        assertEquals("-2", elementaryMathOperation.devision(4,-2));
        assertEquals("-2", elementaryMathOperation.devision(-4,2));
        assertEquals("2", elementaryMathOperation.devision(-4,-2));

        assertEquals("0", elementaryMathOperation.devision(0,-2));
        assertEquals("2", elementaryMathOperation.devision(0,2));

        assertEquals("На 0 делить нельзя", elementaryMathOperation.devision(4,0));

    }

    @Test
    public void testRemainderOfDivision() throws ArithmeticException{
        assertEquals("2", elementaryMathOperation.remainderOfDivision(8,3));
        assertEquals("-2", elementaryMathOperation.remainderOfDivision(-8,3));
        assertEquals("2", elementaryMathOperation.remainderOfDivision(8,-3));

        assertEquals("На 0 делить нельзя", elementaryMathOperation.remainderOfDivision(8,0));

    }

    @Test
    public void testCompareValues(){
        int comparingValueOne = 4;
        int comparingValueTwo = 2;
        int comparingValueOneForLess = 2;
        int comparingValueTwoForLess = 4;
        assertEquals("Два числа равны", elementaryMathOperation.compareValues(4, 4));
        assertEquals(comparingValueTwo + " больше, чем "+ comparingValueOne, elementaryMathOperation.compareValues(comparingValueOne, comparingValueTwo));
        assertEquals(comparingValueTwoForLess + " менььше, чем "+ comparingValueOneForLess, elementaryMathOperation.compareValues(comparingValueOneForLess, comparingValueTwoForLess));

    }


    }

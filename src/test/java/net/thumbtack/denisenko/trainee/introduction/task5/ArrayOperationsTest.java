package net.thumbtack.denisenko.trainee.introduction.task5;

import net.thumbtack.denisenko.trainee.introduction.task5.ArrayOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTest {
    ArrayOperations operationsArray = new ArrayOperations();



    @Test
    public void amountAllValues() throws Exception {
        int [] array = {4, 2, 3};
        assertEquals(9 , operationsArray.amountAllValues(array));

    }

    @Test
    public void multyValueArray() throws Exception {
        int [] array = {4, 2, 3};
        assertEquals(24 , operationsArray.multyAllValues(array));
    }

    @Test
    public void minValueArray() throws Exception {
        int [] array = {4, 2, 3};
        assertEquals(2 , operationsArray.minValueArray(array));
    }

    @Test
    public void maxValueArray() throws Exception {
        int [] array = {4, 2, 8, 6};
        assertEquals(8 , operationsArray.maxValueArray(array));
    }

    /*
    @Test
    public void middleValue() throws Exception {
        int [] array = {4, 2, 8, 6};
        int amountArray =  operationsArray.amountAllValues(array);
        assertEquals(8 , operationsArray.middleValue(array, amountArray), 0.001);
    }
    */

}
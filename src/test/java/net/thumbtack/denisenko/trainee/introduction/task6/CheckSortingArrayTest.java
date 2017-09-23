package net.thumbtack.denisenko.trainee.introduction.task6;

import net.thumbtack.denisenko.trainee.introduction.task6.CheckSortingArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSortingArrayTest {

    CheckSortingArray checkSortingArray = new CheckSortingArray();

    @Test
    public void checkAscendingArray() throws Exception {
        int [] trueArray = {1, 2, 8, 9};
        int [] falseArray = {1, 10, 0, 9};
        assertTrue(checkSortingArray.checkAscendingArray(trueArray));
        assertFalse(checkSortingArray.checkAscendingArray(falseArray));
    }


    @Test
    public void checkDescendingArray() throws Exception {
        int [] trueArray = {4, 3, 2, 1};
        int [] falseArray = {15, 20, 19, 18};
        //assertTrue(checkSortingArray.checkDescendingArray(trueArray));
        assertFalse(checkSortingArray.checkDescendingArray(falseArray));
    }

}
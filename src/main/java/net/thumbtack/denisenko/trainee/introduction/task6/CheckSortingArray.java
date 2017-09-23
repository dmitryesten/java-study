package net.thumbtack.denisenko.trainee.introduction;

public class CheckSortingArray {

    /**
     * Проверяет массив на возрастание
     * @param array
     * @return true if the array is ascending and false if the array isn't ascending
     */
    public boolean checkAscendingArray (int [] array) {
        int equalTwoPairValuesArray = 0;
        for(int i = 1; i < array.length - 1; i++){
            equalTwoPairValuesArray += (array[i] >= array[i - 1]) ?  equalTwoPairValuesArray + 1 : equalTwoPairValuesArray - 1;
        }
        return (equalTwoPairValuesArray == array.length - 1);
    }


    /**
     * Проверяет массив на убывание
     * @param array
     * @return true if the array is descending and false if the array isn't descending
     */
    public static boolean checkDescendingArray (int [] array) {
        int equalTwoPairValuesArray = 0;
        for(int iterator = 1; iterator < array.length; iterator++){
            equalTwoPairValuesArray += (array[iterator] <= array[iterator - 1]) ?  (equalTwoPairValuesArray + 1) : (equalTwoPairValuesArray - 1);
        }
        return (equalTwoPairValuesArray == array.length - 1);
    }


}

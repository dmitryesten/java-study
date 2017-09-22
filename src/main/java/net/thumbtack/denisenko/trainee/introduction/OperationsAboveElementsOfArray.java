package net.thumbtack.denisenko.trainee.introduction;


// REVU ArrayOperations :-)
public class OperationsAboveElementsOfArray {


    /**
     * @param array
     * @return result amount
     */
    public static int amountAllValues (int [] array) {
        int amount = 0;
        for(int iteration = 0; iteration < array.length; iteration++ )
            amount += array[iteration];

        return amount;
    }


    /**
     * @param array
     * @return result multiplication
     */
    public static int multyAllValues (int [] array) {
        int multy = 1;
        // REVU use for each
        for(int iteration = 0; iteration < array.length; iteration++ )
            multy *= array[iteration];

        return multy;
    }


    /**
     * @param array
     * @return minimum value of the array
     */
    public static int minValueArray(int [] array){
        int min = array[0];
        // REVU use for each
        for(int iteration = 0; iteration < array.length; iteration++ ) {
            if (array[iteration] < min)
                min = array[iteration];
        }
        return min;
    }


    /**
     * @param array
     * @return max value of the array
     */
    public static int maxValueArray(int [] array){
        int max = array[0];
        // REVU use for each
       for(int iteration = 0; iteration < array.length; iteration++ ) {
            if (array[iteration] > max)
                max = array[iteration];
        }
        return max;
    }


    /**
     * @param array
     * @param amountValue amount all value
     * @return middle value of the array
     */
    public static double middleValue(int [] array, int amountValue) {
        return (double)amountValue / (double)array.length;
    }



}
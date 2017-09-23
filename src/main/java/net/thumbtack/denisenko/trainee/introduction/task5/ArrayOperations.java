package net.thumbtack.denisenko.trainee.introduction.task5;



public class ArrayOperations {


    /**
     * @param array
     * @return result amount
     */
    public static int amountAllValues (int [] array) {
        int amount = 0;
        for (int iter : array) {
            amount += iter;
        }
        return amount;
    }


    /**
     * @param array
     * @return result multiplication
     */
    public static int multyAllValues (int [] array) {
        int multy = 1;
        for (int iter : array) {
            multy *= iter;
        }
        return multy;
    }


    /**
     * @param array
     * @return minimum value of the array
     */
    public static int minValueArray(int [] array){
        int min = array[0];
        for (int iter : array) {
            if(iter < min)
                min = iter;
        }
        return min;
    }


    /**
     * @param array
     * @return max value of the array
     */
    public static int maxValueArray(int [] array){
        int max = array[0];
        for (int iter : array) {
            if(iter > max)
                max = iter;
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
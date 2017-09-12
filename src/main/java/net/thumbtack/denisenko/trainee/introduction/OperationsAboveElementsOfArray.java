package net.thumbtack.denisenko.trainee.introduction;

import java.util.Random;

public class OperationsAboveElementsOfArray {

	// REVU private
    Random rand = new Random();
    String allElementsArray = "";

    int  sizeArray = randomSizeArray();
    int [] arrayIntegerValues = new int[sizeArray];


    public String printAllElementsArray(int [] arrayIntegerValues){

        //int [] arrayIntegerValues = {40, 5, 12, 55, 6, 27, 10};

        for ( int iter : arrayIntegerValues) {
            allElementsArray += iter + " ";
        }
        return allElementsArray;
    }


    private int randomSizeArray(){
        return rand.nextInt(50) + 1;
    }


    // REVU assigning to foreach variable inside loop has no sense
    // this method doesn't populate array!
    private int[] randomValuesArray(int [] arrayIntegerValues){
        for ( int iter : arrayIntegerValues) {
            iter = rand.nextInt(100) ;
        }
        return arrayIntegerValues;
    }


    /*
    public int amountAllElementsOfArray(int [] array){

    }
    */

}
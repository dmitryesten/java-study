package net.thumbtack.denisenko.trainee;

import net.thumbtack.denisenko.trainee.introduction.*;

import java.util.Random;
import java.util.Scanner;


public class Trainee
{
    static int valueOne;
    static int valueTwo;
    static int sizeOfArray;
    private static int [] array;


    public static void main( String[] args ) throws Throwable {

        HelloWorld stringHelloWorld = new HelloWorld();
        ElementaryMathOperation elementaryMathOperation = new ElementaryMathOperation();
        OperationsAboveElementsOfArray operationsAboveElementsOfArray = new OperationsAboveElementsOfArray();
        CheckSortingArray checkSortingArray = new CheckSortingArray();
        Point2D point2D = new Point2D();

        Scanner in = new Scanner(System.in);
        Random random = new Random();


        array = new int[random.nextInt(12) + 1];


        // Task_1 part Intro
        System.out.println("Task_1");
        System.out.println(stringHelloWorld.printStringHelloWorld());


        // Task_2
        System.out.println("\r\nTask_2");
        System.out.println("Input value_1:");
        valueOne = 8; //in.nextDouble();
        System.out.println("Input value_2:");
        valueTwo = -3; //in.nextDouble();
        System.out.println("Сумма:" + elementaryMathOperation.adder(valueOne, valueTwo));
        System.out.println("Произведение:" + elementaryMathOperation.multy(valueOne, valueTwo));
        System.out.println("Частное:" + elementaryMathOperation.devision(valueOne, valueTwo));
        System.out.println("Остаток от деления:" + elementaryMathOperation.remainderOfDivision(valueOne, valueTwo));
        System.out.println("Сравнение: " + elementaryMathOperation.compareValues(valueOne, valueTwo));


        System.out.println("\r\nTask_4");

        randomValue(array);
        String valuesArray = "";
        for(int i = 0; i < array.length; i++){
            valuesArray +=  array[i] + ", ";
        }

        System.out.println("Массив: " + valuesArray );
        System.out.println("Сумма элементов " + operationsAboveElementsOfArray.amountAllValues(array) );
        System.out.println("Произведение элементов " + operationsAboveElementsOfArray.multyAllValues(array) );
        System.out.println("MIN элемент: " + operationsAboveElementsOfArray.minValueArray(array) );
        System.out.println("MAX элемент: " + operationsAboveElementsOfArray.maxValueArray(array) );
        System.out.println("Среднее значение: " + operationsAboveElementsOfArray.middleValue(array, operationsAboveElementsOfArray.amountAllValues(array) ) );



        int [] array2 = {1, 2, 80};
        int [] array3 = {5, 4, 2, 1};
        //Task_6
        int equalTwoPairValuesArray = 1;
        int t = 0;
        for(int iterator = 1; iterator < array2.length - 1; iterator++){
            equalTwoPairValuesArray = (array2[iterator] >= array2[iterator - 1]) ? t + 1 : (equalTwoPairValuesArray - 1);
        }
        System.out.println(array2.length+" x "+ (t));
        System.out.println("Массив возрастающий: " + checkSortingArray.checkAscendingArray(array2));
        System.out.println("Массив убывающий: " + checkSortingArray.checkDescendingArray(array3));



        //Task_7
        point2D.movePoint(2,3);
        System.out.println(point2D.getAbscissaOx());
        System.out.println(point2D.getOrdinateOy());
        System.out.println( point2D.printCoordinates() );



        in.close();

    }

    private static int [] randomValue(int [] array){
        Random randNumber = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = randNumber.nextInt(50) + 1;
        }
        return array;
    }


}

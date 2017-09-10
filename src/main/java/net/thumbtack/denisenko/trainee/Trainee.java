package net.thumbtack.denisenko.trainee;

import net.thumbtack.denisenko.trainee.introduction.ElementaryMathOperation;
import net.thumbtack.denisenko.trainee.introduction.HelloWorld;
import net.thumbtack.denisenko.trainee.introduction.OperationsAboveElementsOfArray;

import java.util.Scanner;


public class Trainee
{
    static int valueOne;
    static int valueTwo;
    static int sizeOfArray;

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        HelloWorld stringHelloWorld = new HelloWorld();
        ElementaryMathOperation elementaryMathOperation = new ElementaryMathOperation();
        OperationsAboveElementsOfArray operationsAboveElementsOfArray = new OperationsAboveElementsOfArray();

        // Task_1 part Intro
        System.out.println(stringHelloWorld.printStringHelloWorld());


        // Task_2 and Task_3 part Intro
        System.out.println("Input value_1:");
        valueOne = 80; //in.nextDouble();
        System.out.println("Input value_2:");
        valueTwo = 3; //in.nextDouble();
        System.out.println("Сумма:" + elementaryMathOperation.adder(valueOne, valueTwo));
        System.out.println("Произведение:" + elementaryMathOperation.multy(valueOne, valueTwo));
        System.out.println("Частное:" + elementaryMathOperation.devision(valueOne, valueTwo));
        System.out.println("Остаток от деления:" + elementaryMathOperation.remainderOfDivision(valueOne, valueTwo));
        System.out.println("Сравнение: " + elementaryMathOperation.compareValues(valueOne, valueTwo));

        // Task_5 part Intro
        //sizeOfArray = in.nextInt();
        int [] arrayIntegerValues = new int[20];
        System.out.println();
        //System.out.println(operationsAboveElementsOfArray.printAllElementsArray());












    }
}

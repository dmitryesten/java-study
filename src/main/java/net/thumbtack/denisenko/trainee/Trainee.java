package net.thumbtack.denisenko.trainee;

import net.thumbtack.denisenko.trainee.introduction.ElementaryMathOperation;
import net.thumbtack.denisenko.trainee.introduction.HelloWorld;

import java.util.Scanner;


public class Trainee
{
    static int valueOne;
    static int valueTwo;

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        HelloWorld stringHelloWorld = new HelloWorld();
        ElementaryMathOperation elementaryMathOperation = new ElementaryMathOperation();

        // Task_1 part Intro
        System.out.println(stringHelloWorld.printStringHelloWorld());


        // Task_2 part Intro
        System.out.println("Input value_1:");
        valueOne = in.nextInt();
        System.out.println("Input value_2:");
        valueTwo = in.nextInt();
        System.out.println("Сумма:" + elementaryMathOperation.adder(valueOne, valueTwo));
        System.out.println("Произведение:" + elementaryMathOperation.multy(valueOne, valueTwo));
        System.out.println("Частное:" + elementaryMathOperation.devision(valueOne, valueTwo));
        System.out.println("Остаток от деления:" + elementaryMathOperation.remainderOfDivision(valueOne, valueTwo));
        System.out.println("Сравнение: " + elementaryMathOperation.compareValues(valueOne, valueTwo));
    }
}

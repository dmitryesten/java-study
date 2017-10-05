package net.thumbtack.denisenko.trainee;


import net.thumbtack.denisenko.trainee.mathoperation.MathOperation;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;
import net.thumbtack.denisenko.trainee.mathoperation.ArrayOperations;
import net.thumbtack.denisenko.trainee.mathoperation.CheckSortingArray;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.util.Random;
import java.util.Scanner;


public class Trainee
{
    static int valueOne;
    static int valueTwo;
    static int sizeOfArray;
    private static int [] array;


    public static void main( String[] args ) throws Throwable {

        MathOperation elementaryMathOperation = new MathOperation();
        //ArrayOperations operationsAboveElementsOfArray = new ArrayOperations();
        //CheckSortingArray checkSortingArray = new CheckSortingArray();
        //FloatingOperations floatingOperations = new FloatingOperations();


        Scanner in = new Scanner(System.in);
        Random random = new Random();


        array = new int[random.nextInt(12) + 1];


        System.out.println("\r\n----------Task_2-----------------------------" );
        // Task_2
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
        System.out.println("Сумма вещественных:"+ FloatingOperations.add(0.09, 0.011));
        System.out.println("Сравнение вещественных:"+ FloatingOperations.compareValues(0.09, 2.09));

        System.out.println("----------Task_5-----------------------------" );
        randomValue(array);
        String valuesArray = "";
        /*for(int i = 0; i < array.length; i++){
            valuesArray +=  array[i] + ", ";
        }

        System.out.println("Массив: " + valuesArray );
        System.out.println("Сумма элементов " + operationsAboveElementsOfArray.amountAllValues(array) );
        System.out.println("Произведение элементов " + operationsAboveElementsOfArray.multyAllValues(array) );
        System.out.println("MIN элемент: " + operationsAboveElementsOfArray.minValueArray(array) );
        System.out.println("MAX элемент: " + operationsAboveElementsOfArray.maxValueArray(array) );
        System.out.println("Среднее значение: " + operationsAboveElementsOfArray.middleValue(array, operationsAboveElementsOfArray.amountAllValues(array) ) );



        System.out.println("\r\n----------Task_6-----------------------------" );
        //Task_5
        System.out.println("Массив возрастающий: " + checkSortingArray.checkAscendingArray(array));
        System.out.println("Массив убывающий: " + checkSortingArray.checkDescendingArray(array));
*/
/*
        System.out.println("\r\n----------Task_7-----------------------------" );
        Point2D point2D = new Point2D(1, 2);
        System.out.println("Начальная координата: " + Point2D.printCoordinates(point2D) );
        point2D.move(2,4);
        System.out.println("Точка перемещена:" + Point2D.printCoordinates(point2D) );
*/

        System.out.println("\r\n----------Task_8 & Task_4-----------------------------" );
        //Task_8

        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        //Point2D topLeft3 = new Point2D(8, 6);
        //Point2D bottonRight4 = new Point2D(9, 1);
        Point2D topLeft3 = new Point2D(2, 4);
        Point2D bottonRight4 = new Point2D(6, 3);

        Rectangle rectangle = new Rectangle(4, 2);
        Rectangle rectangle2 = new Rectangle(topLeft3, bottonRight4);

        System.out.println( rectangle.printCoordinates() );
        System.out.println("\r\n"+ rectangle2.printCoordinates() );
        System.out.println("Площадь = " + rectangle.area() );
        //rectangle.move(1,1);
        //System.out.println("Перемещенин треугольника:\r\n"+ Rectangle.printCoordinatesRactangle(rectangle) );
        //rectangle.reduceRectangle(1,1);
        //System.out.println("Уменьшение треугольника:\r\n"+ Rectangle.printCoordinatesRactangle(rectangle)+"\r\n" );
        //System.out.println("Точка лежит на плоскасти: "+ Rectangle.isPointContainedInRactangle(point3, rectangle) );
        System.out.println("Прямоугольник находиться внутри другого: "+ Rectangle.isRectangleContainedInOtherRectangle(rectangle2, rectangle) );
        System.out.println("Два прямоугольнрка пересекаются:"+Rectangle.isRectangleCrossingWithOtherRectangle(rectangle, rectangle2));


        System.out.println(rectangle.printCoordinates() );

        /*
        System.out.println("\r\n----------Task_11-----------------------------" );
        Point2D point2D = new Point2D(1,1);
        CircleFactory circleFactory = new CircleFactory(point2D, 3);
        System.out.println("i ="+ CircleFactory.getNumberInstances() );
        CircleFactory circleFactory2 = new CircleFactory(point2D, 3);
        System.out.println("i ="+ CircleFactory.getNumberInstances() );
        CircleFactory circleFactory3 = new CircleFactory(point2D, 3);
        System.out.println("i ="+ CircleFactory.getNumberInstances() );

        System.out.println("\r\n----------Task_9-----------------------------" );
        Point2D p1 = new Point2D(2,1);
        Point2D p2 = new Point2D(5,6);
        Point2D p3 = new Point2D(8,1);

        Point2D p4 = new Point2D(5,3);
        Point2D p5 = new Point2D(10,10);


        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println("\r\n- "+ Triangle.area(triangle));

        */
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

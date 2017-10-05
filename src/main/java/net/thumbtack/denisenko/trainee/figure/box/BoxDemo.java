package net.thumbtack.denisenko.trainee.figure.box;


import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;

public class BoxDemo {

    public static void main(String [] args) {

        //Box<Rectangle> box = new Box<>( new Rectangle());

        //Box<Circle> box1 = new Box<>();
        //Box <Circle> box2 = new Box<>(new Circle(1,1, 2) );

        //System.out.println("прямоугольник "+box.getContent());
        //System.out.println("CUBE "+box1.getContent());
        //System.out.println("Круг "+box2.getContent());
        System.out.println(isSameSquareStatic(new Box(new Rectangle()), new Box(new Rectangle(2,3))));

    }


    public static <T extends Rectangle & Square>  boolean isSameSquareStatic(Box box1, Box box2){
        return FloatingOperations.compareValues(box1.square(), box2.square());
    }


}

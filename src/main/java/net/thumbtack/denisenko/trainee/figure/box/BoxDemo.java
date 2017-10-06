package net.thumbtack.denisenko.trainee.figure.box;



import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry3D.Rectangle3D;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;

public class BoxDemo {

    public static void main(String [] args) {

        //Box<Rectangle> box = new Box<>( new Rectangle());

        //Box<Circle> box1 = new Box<>();
        //Box <Circle> box2 = new Box<>(new Circle(1,1, 2) );

        System.out.println(isSameSquareStatic(new Box(new Rectangle()), new Box(new Rectangle(2,3))));

        ArrayBox<Rectangle> arrayBox = new ArrayBox<>(new Rectangle[0]);
        ArrayBox<Rectangle3D> arrayBox1 = new ArrayBox<>(new Rectangle3D[1]);
        //ArrayBox<String> arrayBox2 = new ArrayBox<>(new String[2]); //generic limited Rectangle




    }


    public static <T extends Rectangle & Square>  boolean isSameSquareStatic(Box box1, Box box2){
        return FloatingOperations.compareValues(box1.square(), box2.square());
    }


}

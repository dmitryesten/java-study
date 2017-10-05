package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

public class AnonymousRectangle3D {

    public static void main (String [] args){

        int a = 2;
        int b = 3;
        int c = 4;
        double volume = (int) new Rectangle3D(a, b, c){
            private int x = a;
            private int y = b;
            private int z = c;
            public double volume(){
                return this.x * this.y * this.z;
            }
        }.volume();

        System.out.println(volume);



        Rectangle rectangle = new Rectangle3D(2, 5 , 6);
        Circle circle = new Cylinder(5,5, 10, 2 );
        System.out.println(rectangle.getClass().getName());
        System.out.println(circle.getClass().getName());

        //Error
        //Rectangle3D rectangle3D = new Rectangle(2, 4);
        //Rectangle3D rectangle3D = (Rectangle3D) new Rectangle(2, 4);

    }

}

package net.thumbtack.denisenko.trainee.lesson2;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.introduction.rectangle.Rectangle;
import net.thumbtack.denisenko.trainee.lesson2.rectangle3d.Rectangle3D;

public class TraineeLessonTwo {

    public static void main(String [] args){
        Rectangle r1 = new Rectangle(3, 2);

        Point2D p1 = new Point2D(4,3);
        Point2D p2 = new Point2D(6, 2);
        Rectangle r2 = new Rectangle(p1, p2);
       // Rectangle3D r = new Rectangle3D();
        Rectangle3D r3 = new Rectangle3D(6, 6, 6);

        //Point3D point3D = new Point3D(8, 8, 8);
        System.out.println(Rectangle3D.isPoint3DInRectagle(10, 10, 10,  r3 ));
        System.out.println(Rectangle.isRectangleCrossingWithOtherRectangle(r2, r1));
        System.out.println(Rectangle.isRectangleCrossingWithOtherRectangle(r2, r1));



    }
}

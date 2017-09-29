package net.thumbtack.denisenko.trainee.lesson2.anonymousclass;

import net.thumbtack.denisenko.trainee.lesson2.rectangle3d.Rectangle3D;

public class AnonymousRectangle3D {

    public static void main (String [] args){

        int a = 2;
        int b = 3;
        int c = 4;
        int volume = new Rectangle3D(a, b, c){
            private int x = a;
            private int y = b;
            private int z = c;
            int volume(){
                return this.x * this.y * this.z;
            }
        }.volume();

        System.out.println(volume);
    }

}

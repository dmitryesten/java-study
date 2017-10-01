package net.thumbtack.denisenko.trainee.geometry3D;

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
    }

}

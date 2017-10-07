package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnonymousRectangle3DTest {
    @Test
    public void anonymousRectangle() throws Exception {
        int a = 2;
        int b = 3;
        int c = 4;

        assertEquals(24.00, (int) new Rectangle3D(a, b, c){
            private int x = a;
            private int y = b;
            private int z = c;
            public double volume(){
                return this.x * this.y * this.z;
            }
        }.volume(), 0.001);

    }

}
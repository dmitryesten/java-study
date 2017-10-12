package net.thumbtack.denisenko.trainee.figure.box;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

public class ArrayBoxTest {
    @Ignore
    public void create() throws Exception {
        ArrayBox<Rectangle> arrayBox = new ArrayBox<>(new Rectangle[0]);
        try {
            assertEquals(
                    new ArrayBox[]{new ArrayBox<Rectangle>(new Rectangle[0])},
                    arrayBox.create(new ArrayBox[]{new ArrayBox<Rectangle>(new Rectangle[0])})  );
        }catch (InstantiationException e){
            e.printStackTrace();
        }

    }
}
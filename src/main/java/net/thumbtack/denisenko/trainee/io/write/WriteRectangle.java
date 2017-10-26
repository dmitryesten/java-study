package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import java.io.*;

public class WriteRectangle {

    public static void write(Rectangle r, File file) throws IOException {
        try(OutputStream dout = new FileOutputStream(file)) {
            byte [] bytes = r.toString().getBytes();
            for (byte i : bytes) {
                dout.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}


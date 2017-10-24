package net.thumbtack.denisenko.trainee.rwfile;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import java.io.*;

public class WriteRectangle {

    public static void write(Rectangle r, File file) throws IOException {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file))) {
            byte [] bytes = r.toString().getBytes();
            for (byte i : bytes) {
                dout.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}


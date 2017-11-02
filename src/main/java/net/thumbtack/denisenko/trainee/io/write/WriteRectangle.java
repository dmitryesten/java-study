package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import java.io.*;

public class WriteRectangle {

    public static void write(Rectangle r, File file) throws IOException, FileException {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file))) {
            dout.writeUTF(r.toString());
        } catch (FileNotFoundException e) {
           throw new FileException();
        }

    }



}


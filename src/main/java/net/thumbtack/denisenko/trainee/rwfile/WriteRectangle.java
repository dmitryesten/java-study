package net.thumbtack.denisenko.trainee.rwfile;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.io.*;

public class WriteRectangle {

    public void writeRectangle() throws IOException {
        Rectangle r = new Rectangle();
        FileOutputStream fout = new FileOutputStream("byte_rect.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        byte [] b  = new Rectangle().toString().getBytes();
        oos.writeObject(new String(b) );
        oos.flush();
        oos.close();
    }

}

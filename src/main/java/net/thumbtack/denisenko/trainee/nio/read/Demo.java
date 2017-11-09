package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.io.write.WriteRectangle;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String [] args) throws IOException {
        File file = new File("rect.dat");
        ByteBufferReader byteBufferReader = new ByteBufferReader();
        try {
          //  WriteRectangle.write(new Rectangle(), file);
            ByteBufferReader.read(file);
        }  catch (FileException e) {
            e.printStackTrace();
        }

    }

}

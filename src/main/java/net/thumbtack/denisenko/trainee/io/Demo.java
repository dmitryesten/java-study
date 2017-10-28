package net.thumbtack.denisenko.trainee.io;

import com.google.gson.Gson;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.io.read.ReadRectangle;
import net.thumbtack.denisenko.trainee.io.write.WriteRectangle;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String [] args) throws IOException, TraineeException, IllegalAccessException {

        Rectangle r = new Rectangle();
        File file = new File("rect.dat");
        WriteRectangle.write(r, file);
        ReadRectangle.read(file);

        byte [] bytes = r.toString().getBytes();
        //for (byte i:bytes) {
          //  System.out.print(i);
        //}

        Gson s = new Gson();


    }

}

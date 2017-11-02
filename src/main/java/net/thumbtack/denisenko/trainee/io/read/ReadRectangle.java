package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;

import java.io.*;

public class ReadRectangle {

    public static void read(File file) throws IOException, FileException {
        try(DataInputStream dinput = new DataInputStream(new FileInputStream(file))) {
            while(dinput.available() > 0) {
                System.out.print( dinput.read() );
            }
        } catch (FileNotFoundException e) {
            throw new FileException(file);
        }
    }

}

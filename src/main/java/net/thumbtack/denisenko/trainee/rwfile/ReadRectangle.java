package net.thumbtack.denisenko.trainee.rwfile;

import java.io.*;

public class ReadRectangle {

    public static void readRectangle(File file) throws IOException {
        try(DataInputStream dinput = new DataInputStream(new FileInputStream(file.getAbsoluteFile()))) {
            while(dinput.available() > 0) {
                System.out.print((char)dinput.read());
                //System.out.print( dinput.read() );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

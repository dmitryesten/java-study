package net.thumbtack.denisenko.trainee.io.read;

import java.io.*;

public class ReadRectangle {

    public static void read(File file) throws IOException {
        try(InputStream dinput = new FileInputStream(file)) {
        	// REVU you do not need to read bytes, also converting them to char is wrong idea
            while(dinput.available() > 0) {
                System.out.print((char)dinput.read());
                //System.out.print( dinput.read() );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

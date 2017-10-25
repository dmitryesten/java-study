package net.thumbtack.denisenko.trainee.rwfile;

import java.io.*;

public class ReadRectangle {

    public static void read(File file) throws IOException {
        try(InputStream dinput = new DataInputStream(new FileInputStream(file))) {
            while(dinput.available() > 0) {
                System.out.print((char)dinput.read());
                //System.out.print( dinput.read() );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;

import java.io.*;

public class ReadRectangle {


    /**
     * Task_4.9 Read binary file
     * @param file - source
     * @return string - result's reader
     * @throws IOException
     * @throws FileException
     */
   public static void read(File file) throws IOException, FileException {
       try(DataInputStream dinput = new DataInputStream(new FileInputStream(file))) {
            while(dinput.available() > 0) {
                  dinput.read();
            }
        } catch (FileNotFoundException e) {
           throw new FileException("Ops, file is found", e.getCause());
        }

    }

}

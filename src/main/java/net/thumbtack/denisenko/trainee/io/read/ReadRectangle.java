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
   public static StringBuilder read(File file) throws IOException, FileException {
       StringBuilder stringResult = new StringBuilder();
       try(DataInputStream dinput = new DataInputStream(new FileInputStream(file))) {
           int iChar;
           while(dinput.available() > 0) {
               iChar = dinput.read();
               stringResult.append(iChar);
            }
        } catch (FileNotFoundException e) {
           throw new FileException("Ops, file is not found", e.getCause());
        }
        return stringResult;
    }

}

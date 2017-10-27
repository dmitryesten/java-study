package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.io.write.FileWriterTrainee;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class FileReaderTrainee {

    public static void fileReader(Trainee t, File file) throws IOException, IllegalAccessException {
        FileWriterTrainee.fileWriter(t,file);
        // REVU you do not need to read bytes
        // Use BufferedReader and read full line
        try(Reader fileReader = new FileReader(file)){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
        	// REVU do not call printStackTrace, throw your exception 
            e.printStackTrace();
        }
    }

}

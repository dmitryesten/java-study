package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.io.write.FileWriterTrainee;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class FileReaderTrainee {

	// REVU what this method must do ?
    public static void fileReader(Trainee t, File file) throws IOException, FileException, IllegalAccessException {
        FileWriterTrainee.fileWriter(t,file);
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))){
            String s;
            while((s=fileReader.readLine())!=null){
            	// REVU never call print
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
        	throw new FileException(file);
        }
    }

}

package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.io.write.FileWriterTrainee;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class FileReaderTrainee {

    /**
     * Task_4.13 Create new instance's Trainee and to read its of the file
     * @param t - new instance's Trainee
     * @param file - source file
     * @throws IOException if method has problem input-output stream
     * @throws FileException if file is found
     * @throws IllegalAccessException if parameters's method is not correct
     */
	// REVU never use one-letter identifiers. Trainee trainee instead of Trainee t
    public static String readerLines(Trainee t, File file) throws IOException, FileException, IllegalAccessException {
        FileWriterTrainee.fileWriter(t,file);
        String string = null;
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))){
            String s;
            // REVU it is not a good idea to concatenate Strings. Use StringBuilder
            while((s=fileReader.readLine())!=null){
                string += s;
            }
        } catch (FileNotFoundException e) {
        	throw new FileException("Ops, file is found", e.getCause());
        }
        return string;
    }

}

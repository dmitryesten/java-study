package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.io.write.FileWriterTrainee;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class FileReaderTrainee {

    /**
     * Task_4.13 Create new instance's Trainee and to read its fields of the file
     * @param trainee - new instance's Trainee
     * @param file - source file
     * @throws IOException if method has problem input-output stream
     * @throws FileException if file is found
     * @throws IllegalAccessException if parameters's method is not correct
     */
    public StringBuilder readLines(Trainee trainee, File file) throws IOException, FileException, IllegalAccessException {
        FileWriterTrainee fileWriterTrainee = new FileWriterTrainee();
        fileWriterTrainee.write(trainee,file);

        StringBuilder stringResultRead = new StringBuilder();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))){
            String stringFieldsTrainee;
            while((stringFieldsTrainee=fileReader.readLine())!=null){
                stringResultRead.append(stringFieldsTrainee);
            }
        } catch (FileNotFoundException e) {
        	throw new FileException("Ops, file is not found", e.getCause());
        }
        return stringResultRead;
    }

}

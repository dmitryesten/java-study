package net.thumbtack.denisenko.trainee.rwfile;

import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class FileReaderTrainee {

    public static void fileReader(Trainee t, File file) throws IOException, IllegalAccessException {
        FileWriterTrainee.fileWriter(t,file);
        try(Reader fileReader = new FileReader(file)){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

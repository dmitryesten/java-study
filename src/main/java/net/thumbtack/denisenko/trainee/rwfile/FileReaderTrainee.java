package net.thumbtack.denisenko.trainee.rwfile;

import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTrainee {

    public static void fileReader(Trainee t, File file) throws IOException, IllegalAccessException {
        FileWriterTrainee.fileWriter(t,file);
        try(FileReader fileReader = new FileReader(file)){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fileReaderOneLine(Trainee t, File file) throws IOException, IllegalAccessException {
        FileWriterTrainee.writerOneLine(t,file);
        try(FileReader fileReader = new FileReader(file)){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

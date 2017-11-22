package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class FileWriterTrainee {

    public  void write(Trainee trainee, File file) throws IllegalAccessException, FileException {
        Class<Trainee> reflectionClass = (Class<Trainee>) trainee.getClass();
        Field[] publicFields = reflectionClass.getDeclaredFields();

        try (Writer fileWriter = new FileWriter(file)) {
            for (Field field : publicFields) {
                field.setAccessible(true);
                fileWriter.write(String.valueOf(field.get(trainee)) + "\r\n");
            }
        } catch (IOException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
    }


    public void writeMonoLine(Trainee trainee, File file) throws IllegalAccessException, FileException {
        Class<Trainee> reflectionClass = (Class<Trainee>) trainee.getClass();
        Field[] publicFields = reflectionClass.getDeclaredFields();

        try (Writer fileWriter = new FileWriter(file)) {
            for (Field field : publicFields) {
                field.setAccessible(true);
                fileWriter.write(String.valueOf(field.get(trainee)) + ' ');
            }
        } catch (IOException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
    }

}
package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class FileWriterTrainee {

    public static void fileWriter(Trainee t, File file) throws IllegalAccessException, FileException {
    	// REVU Class is a raw type. References to generic type Class<T> should be parameterized
        Class reflectionClass = t.getClass();
        Field[] publicFields = reflectionClass.getDeclaredFields();
        try (Writer fileWriter = new FileWriter(file)) {
            for (Field field : publicFields) {
                field.setAccessible(true);
                fileWriter.write(String.valueOf(field.get(t)) + "\r\n");
            }
        } catch (IOException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }
    }


    public static void writerMonoLine(Trainee t, File file) throws IllegalAccessException, FileException {
        Class reflectionClass = t.getClass();
        Field[] publicFields = reflectionClass.getDeclaredFields();
        try (Writer fileWriter = new FileWriter(file)) {
            for (Field field : publicFields) {
                field.setAccessible(true);
                fileWriter.write(String.valueOf(field.get(t)) + ' ');
            }
        } catch (IOException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }
    }

}
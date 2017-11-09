package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class WriteRectangle {

    /**
     * Write field's rectangle to the binary file
     * @param r - rectangle
     * @param file - source binary file for writing
     * @throws IOException
     * @throws FileException
     * @throws IllegalAccessException
     */
    public static void write(Rectangle r, File file) throws IOException, FileException, IllegalAccessException {
        List<Object> list = getFields(r);
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file))) {
            for (Object field : list)
                dout.write(field.toString().getBytes());
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }
    }

    /**
     * @param rectangle - one of instance's rectangle
     * @return List<Object> that to have a lot of field's rectangle
     * @throws IllegalAccessException
     */
    private static List<Object> getFields(Rectangle rectangle) throws IllegalAccessException {
        Class reflectionClass = rectangle.getClass();
        Field[] publicFields = reflectionClass.getDeclaredFields();
        List<Object> list = new ArrayList<>();
        for (Field field : publicFields) {
            field.setAccessible(true);
            list.add(field.get(rectangle));
        }
        return list;
    }
}


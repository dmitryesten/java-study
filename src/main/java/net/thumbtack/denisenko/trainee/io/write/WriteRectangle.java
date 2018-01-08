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
     * @param rectangle - rectangle
     * @param file - source binary file for writing
     * @throws IOException
     * @throws FileException
     * @throws IllegalAccessException
     */
    public static void write(Rectangle rectangle, File file) throws FileException, IllegalAccessException, IOException {
        List<Object> list = getFields(rectangle);
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file))) {
            for (Object field : list)
                dout.write(field.toString().getBytes());
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
    }

    /**
     * Return collection fields of your Rectangle
     * @return List<Object> that to have a lot of field's rectangle
     * @throws IllegalAccessException
     * @param rectangle
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


package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamRectangle {

    public void printStream(Rectangle rectangle, File file) throws FileException {
        try(PrintStream ps = new PrintStream(new FileOutputStream(file))){
            ps.println(rectangle.toString());
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
    }

}

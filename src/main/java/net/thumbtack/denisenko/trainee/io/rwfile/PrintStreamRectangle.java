package net.thumbtack.denisenko.trainee.io.rwfile;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamRectangle {

    public static void printStream(Rectangle r, File file){
        try(PrintStream ps = new PrintStream(new FileOutputStream(file))){
            ps.println(r);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

package net.thumbtack.denisenko.trainee.rwfile;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.io.*;

public class WriteRectangle {

	// let us discuss at Sunday
    public static void writeRectangle(Rectangle r, File file) throws IOException {
        try(DataOutputStream dout = new DataOutputStream( new FileOutputStream(file.getAbsoluteFile()))) {
            String binaryString = WriteRectangle.stringToBinary(r.toString());
            dout.writeBytes(binaryString);
            dout.flush();
            dout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static String stringToBinary(String s) {
        StringBuilder sourceString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sourceString.append(Integer.toBinaryString(c));
        }
        return sourceString.toString();
    }

}


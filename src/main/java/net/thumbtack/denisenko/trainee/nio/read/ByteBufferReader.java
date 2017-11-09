package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;


public class ByteBufferReader {

    public static String read(File file) throws IOException, FileException {
    	// REVU you do not close FileInputStream
    	// write two elements in try-with-resource\
        String string = null;
        /* in dev
        try(ReadableByteChannel channel = new FileInputStream(file).getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)file.length());
            byte b = byteBuffer.get();
            string += b;
        }
        catch (IOException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }*/
        return string;
    }

}
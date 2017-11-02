package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;


public class ByteBufferReader {


    public static void read(File file) throws IOException, FileException {
        try(ReadableByteChannel channel = new FileInputStream(file).getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)file.length());
            int bytesRead = 0;
            while (bytesRead >= 0) {
                byteBuffer.rewind();
                bytesRead = channel.read(byteBuffer);
                byteBuffer.rewind();
                for (int i=0; i< bytesRead; i++) {
                    byte b = byteBuffer.get();
                    System.out.print(b); //System.out.print((char)b);
                }
            }
        }
        catch (IOException e) {
            throw new FileException();
        }
    }

}
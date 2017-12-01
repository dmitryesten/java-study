package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;



public class ByteBufferReader {

    public static StringBuilder read(File file) throws IOException, FileException {
        String result;
        try(ReadableByteChannel channel = Files.newByteChannel(file.toPath())) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(Math.toIntExact(file.length()));
            byte[] array = byteBuffer.array();
            channel.read(ByteBuffer.wrap(array));
            // REVU unnecessary to rewind
            byteBuffer.rewind();
            result = new String(array,"UTF-8");
        }
        return new StringBuilder(result);
    }



}
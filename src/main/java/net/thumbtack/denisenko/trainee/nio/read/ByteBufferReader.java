package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ByteBufferReader {

    public StringBuilder read(File file) throws IOException, FileException {
    	int count;
        StringBuilder string = new StringBuilder();

        try(ReadableByteChannel channel = Files.newByteChannel(ByteBufferReader.path(file))) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(64);
            do {
                count = channel.read(byteBuffer);
                byteBuffer.rewind();
                for (int i = 0; i < count ; i++)
                    string.append((char)byteBuffer.get());
            } while(count != -1);

        } catch (IOException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
        return string;
    }

    private static Path path(File file) throws FileException {
        Path path = null;
        try{
            path = Paths.get(String.valueOf(file));
        }catch (InvalidPathException e){
            throw new FileException("Ops, path did not noted correct", e.getCause());
        }
        return path;
    }

}
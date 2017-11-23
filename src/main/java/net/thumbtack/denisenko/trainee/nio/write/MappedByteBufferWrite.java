package net.thumbtack.denisenko.trainee.nio.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.nio.read.MappedByteBufferReader;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MappedByteBufferWrite {

    /**
     * Write to file numbers 0 ... 99
     * @param file source
     * @throws FileException exception's file problems
     */
    public void write(File file) throws FileException {
        StringBuilder stringResuult = new StringBuilder();
        try(FileChannel channel = (FileChannel) Files.newByteChannel(MappedByteBufferWrite.path(file))){
            long sizeFile = channel.size();
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, sizeFile);
            for (int i = 0; i < 100; i++)
                mappedByteBuffer.putInt(i);

            for (int i = 0; i < sizeFile ; i++)
                stringResuult.append((char)mappedByteBuffer.get());
        } catch (IOException e) {
            throw new FileException("Ops, error I/O", e.getCause());
        }
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

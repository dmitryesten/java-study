package net.thumbtack.denisenko.trainee.nio.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;


public class MappedByteBufferWrite {

    /**
     * Write to file numbers 0 ... 99
     * @param file source
     * @throws FileException exception's file problems
     */
    public void write(File file) throws FileException {
        StringBuilder stringResult = new StringBuilder();
        try(FileChannel channel = (FileChannel) Files.newByteChannel(file.toPath())){
            long sizeFile = channel.size();
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, sizeFile);
            for (int i = 0; i < 100; i++)
                mappedByteBuffer.putInt(i);

            for (int i = 0; i < sizeFile ; i++)
                stringResult.append((char)mappedByteBuffer.get());
        } catch (IOException e) {
            throw new FileException("Ops, error I/O", e.getCause());
        }
    }


}

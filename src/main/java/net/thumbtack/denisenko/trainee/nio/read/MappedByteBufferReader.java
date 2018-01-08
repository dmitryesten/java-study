package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;


public class MappedByteBufferReader {

    public static StringBuilder read(File file) throws FileException {
    	// REVU see comment to ByteBufferReader
        String result;
        StringBuilder stringResult = new StringBuilder();
        try(FileChannel channel = (FileChannel) Files.newByteChannel(file.toPath())){
            long sizeFile = channel.size();
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, sizeFile);
            byte [] array = mappedByteBuffer.array();
            channel.read(MappedByteBuffer.wrap(array));
            mappedByteBuffer.rewind();
            result = new String(array,"UTF-8");
            /*for (int i = 0; i < sizeFile ; i++)
                stringResult.append((char)mappedByteBuffer.get());*/
        } catch (IOException e) {
            throw new FileException("Ops, error I/O", e.getCause());
        }
        return  new StringBuilder(result);
    }


}

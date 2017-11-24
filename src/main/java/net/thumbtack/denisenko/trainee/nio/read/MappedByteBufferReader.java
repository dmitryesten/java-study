package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MappedByteBufferReader {

    public StringBuilder read(File file) throws FileException {
    	// REVU see comment to ByteBufferReader
        StringBuilder stringResuult = new StringBuilder();
        try(FileChannel channel = (FileChannel) Files.newByteChannel(MappedByteBufferReader.path(file))){
            long sizeFile = channel.size();
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, sizeFile);
            for (int i = 0; i < sizeFile ; i++)
                stringResuult.append((char)mappedByteBuffer.get());
        } catch (IOException e) {
            throw new FileException("Ops, error I/O", e.getCause());
        }
        return  stringResuult;
    }

    // REVU also, copy/paste. You do not need in this method at all, but if you need, do not duplicate it in different classes
    // E.g. create class ByteBufferUtils and move it to this class. Or create superclass and move to it
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

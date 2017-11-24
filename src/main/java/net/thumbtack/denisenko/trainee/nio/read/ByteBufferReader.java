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

	// REVU remove IOException from throws
	// REVU I understand why you deleted "static", but it is not good idea to change CODE due to the problems with TESTING
	// Testing must depend on code, code must NOT depend on testing problems
	// About mocking static - see here
	// https://stackoverflow.com/questions/21105403/mocking-static-methods-with-mockito
    public StringBuilder read(File file) throws IOException, FileException {
    	int count;
        StringBuilder string = new StringBuilder();

        try(ReadableByteChannel channel = Files.newByteChannel(ByteBufferReader.path(file))) {
        	// REVU why 64 ? use file.length
            ByteBuffer byteBuffer = ByteBuffer.allocate(64);
            // REVU It is NOT correct to convert bytes to chars.
            // ByteBuffer contains bytes in UTF-8, so some characters are represented by 1 byte, some - by 2 bytes etc.
            // Instead of this do-while, simply 
            // byte[] array = byteBuffer.array();
            // String result =new String(array,"UTF-8");
            
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

    // REVU You do not need in this method Use File.toPath
    // https://docs.oracle.com/javase/7/docs/api/java/io/File.html#toPath()
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
package net.thumbtack.denisenko.trainee.nio.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class MappedByteBufferReader {

    public static void read(File file){
        FileChannel fileChannel = null;
        try(ReadableByteChannel inputStream = new FileInputStream(file).getChannel()){
            MappedByteBuffer mappedByteBuffer = (MappedByteBuffer) MappedByteBuffer.allocate((int)file.length());

            fileChannel.map(FileChannel.MapMode.READ_ONLY,0, (int)file.length());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

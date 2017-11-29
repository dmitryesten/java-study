package net.thumbtack.denisenko.trainee.io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


public class FileTest {


    private File file;

    @Before
    public void setUp(){
        this.file = Mockito.mock(File.class);
    }

    @After
    public void validate() {
        validateMockitoUsage();
    }


    @Test
    public void testName(){
        File file1 = Mockito.mock(File.class);
        when(file1.getName()).thenReturn("test.txt");
        file1.getName();
        Mockito.verify(file1).getName();
    }

    @Test
    public void testCreate() throws IOException {
        File file1 = Mockito.mock(File.class);
        when(file1.createNewFile()).thenReturn(true);
        when(file1.createNewFile()).thenReturn(false);
        when(file1.createNewFile()).thenThrow(new SecurityException());


    }


    @Test
    public void testDelete() throws IOException {
        when(file.delete()).thenReturn(true);
    }

    @Test
    public void testRename() throws IOException {
       when(file.renameTo(new File("newFile.txt"))).thenReturn(true);
       when(file.renameTo(new File("newFile.txt"))).thenReturn(false);
       when(file.renameTo(new File("newFile.txt"))).thenThrow(new SecurityException());
    }


    @Test
    public void testIsDirectory() throws IOException {
        when(file.isDirectory()).thenReturn(true);
        when(file.isDirectory()).thenReturn(false);
        //when(file.isDirectory()).thenThrow(new SecurityException());
        file.isDirectory();
        Mockito.verify(file).isDirectory();
    }

    @Test
    public void testIsAbsolute() throws IOException {
        when(file.isAbsolute()).thenReturn(true);
        when(file.isAbsolute()).thenReturn(false);
        when(file.isAbsolute()).thenThrow(new SecurityException());

    }

    @Test
    public void testToPath() throws IOException {
        when(file.toPath()).thenReturn(new File("test.txt").toPath());
        file.toPath();
        Mockito.verify(file).toPath();
    }

    @Test
    public void testLength() throws IOException {
        when(file.length()).thenReturn(Long.valueOf(45));
        file.length();
        Mockito.verify(file).length();
    }

    @Test
    public void testMkdir() throws IOException {
        when(file.mkdir()).thenReturn(true);
        when(file.mkdir()).thenReturn(false);
        file.mkdir();
        Mockito.verify(file).mkdir();
    }

    @Test
    public void testList() throws IOException {
        when(file.list()).thenReturn(new String[]{"t1", "t2"});
        file.list();
        Mockito.verify(file).list();
    }


}
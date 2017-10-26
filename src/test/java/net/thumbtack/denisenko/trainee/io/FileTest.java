package net.thumbtack.denisenko.trainee.io;


import org.junit.Ignore;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class FileTest {

    private File test = new File("test.txt");

    @Test
    public void testName(){
        assertEquals("test.txt",test.getName());
    }

    @Test
    public void testCreate() throws IOException {
        File create = new File("create.txt");
        assertTrue(create.createNewFile());

        assertTrue(create.isFile());

        boolean exists = create.exists();
        assertTrue(exists);

        create.delete();
    }


    @Test
    public void testDelete() throws IOException {
        File file = new File("testDelete.txt");
        file.createNewFile();
        assertTrue(file.delete());
    }

    @Ignore
    public void testRename() throws IOException {
        File name = new File("create.txt");
        //File rename = new File("recreate.txt");
        name.renameTo(new File("rename.txt"));
        assertEquals("rename.txt", name.getName());
    }


    @Test
    public void testIsDirectory() throws IOException {
        assertFalse(test.isDirectory());
    }


}

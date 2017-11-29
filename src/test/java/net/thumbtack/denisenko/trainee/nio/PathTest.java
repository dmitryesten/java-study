package net.thumbtack.denisenko.trainee.nio;

import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;


import java.io.File;

import java.nio.file.Path;



import static org.mockito.Matchers.*;
import static org.powermock.api.mockito.PowerMockito.when;

public class PathTest {


    private Path path = Mockito.mock(Path.class);


    @Test
    public void getFileName(){
        when(path.getFileName()).thenReturn(new File("").toPath());
        path.getFileName();
        Mockito.verify(path).getFileName();
    }


    @Test
    public void getName(){
        when(path.endsWith("")).thenReturn(anyBoolean());
        path.endsWith("test");
        Mockito.verify(path).endsWith("test");
    }

    @Test
    public void getNameCount(){
        when(path.getNameCount()).thenReturn(5);
        path.getNameCount();
        Mockito.verify(path).getNameCount();
    }

    @Test
    public void getEndsWith(){
        when(path.endsWith(new File("test.js").toPath())).thenReturn(true);
        when(path.endsWith(new File("lesson_1").toPath())).thenReturn(false);
        path.endsWith("test.js");
        Mockito.verify(path).endsWith("test.js");
    }

    @Test
    public void getParent(){
        when(path.getParent()).thenReturn(new File("C:\\test1\\test2\\test3").toPath());
        path.getParent();
        Mockito.verify(path).getParent();
    }

    @Test
    public void getRoot(){
        when(path.getRoot()).thenReturn(new File("C:\\").toPath());
        path.getRoot();
        Mockito.verify(path).getRoot();
    }



}

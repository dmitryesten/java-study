package net.thumbtack.denisenko.trainee.nio;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.when;

public class ChangeExtensionFileTest{

    private ChangeExtensionFile cef =  Mockito.mock(ChangeExtensionFile.class);

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Test
    public void changeEx() throws Exception {
        ChangeExtensionFile cef =  Mockito.mock(ChangeExtensionFile.class);
        doNothing().when(cef).change();

    }


    @Test
    public void getFolder() throws Exception {
        ChangeExtensionFile cef =  Mockito.mock(ChangeExtensionFile.class);
        when(cef.getFolder()).thenReturn(new File("testWithDAT\\"));
    }


}
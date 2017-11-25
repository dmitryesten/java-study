package net.thumbtack.denisenko.trainee.io.serialization;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(GsonSerializable.class)
public class GsonSerializableTest {

    private File file = new File("test.json");
    private Trainee trainee = new Trainee("Ilia", "Ilich", 4);
    private String expected = "{\"name\":\"Ilia\",\"surname\":\"Ilich\",\"rating\":4}";

    public GsonSerializableTest() throws TraineeException {}

    @Test
    public void serializableGson() throws Exception {
        assertEquals(expected, GsonSerializable.serialize(trainee));
    }

    @Test
    public void deserializableGson(){
        assertEquals(trainee, GsonSerializable.deserialize(expected));
    }

    @Test
    public void write() throws Exception {
        PowerMockito.mockStatic(GsonSerializable.class);
        PowerMockito.doThrow(new IOException()).when(GsonSerializable.class);
        GsonSerializable.write(trainee, file);
        PowerMockito.verifyStatic();
    }

    @Test
    public void read() throws Exception {
        Trainee trainee1 = new Trainee("Mary", "Sonne", 5);
        PowerMockito.mockStatic(GsonSerializable.class);
        PowerMockito.when(GsonSerializable.read(file)).thenReturn(trainee1);
        Assert.assertEquals(new Trainee("Mary", "Sonne", 5), GsonSerializable.read(file));
        PowerMockito.verifyStatic();
    }

    @Test(expected = TraineeException.class)
    public void readException() throws Exception {
        PowerMockito.mockStatic(GsonSerializable.class);
        PowerMockito.when(GsonSerializable.read(file)).thenReturn(new Trainee(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt()));
    }

}
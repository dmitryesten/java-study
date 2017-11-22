package net.thumbtack.denisenko.trainee.io.serialization;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import static org.junit.Assert.*;

public class GsonSerializableTest {

    private Trainee t = new Trainee("Ilia", "Ilich", 4);
    private String expected = "{\"name\":\"Ilia\",\"surname\":\"Ilich\",\"rating\":4}";

    public GsonSerializableTest() throws TraineeException {}

    @Test
    public void serializableGson() throws Exception {
        assertEquals(expected, GsonSerializable.serialize(t));
    }

    @Test
    public void deserializableGson(){
        assertEquals(t, GsonSerializable.deserialize(expected));
    }

}
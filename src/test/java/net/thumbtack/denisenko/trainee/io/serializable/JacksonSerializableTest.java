package net.thumbtack.denisenko.trainee.io.serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JacksonSerializableTest {

    private Trainee t = new Trainee("Ilia", "Ilich", 4);
    private String expected = "{\"name\":\"Ilia\",\"surname\":\"Ilich\",\"rating\":4}";

    public JacksonSerializableTest() throws TraineeException {}

    @Test
    public void objectJackson() throws Exception {
        assertEquals(expected, JacksonSerializable.serializableJackson(t));
    }

}
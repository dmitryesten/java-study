package net.thumbtack.denisenko.trainee.io.serializable;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.io.serializable.Serializable;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SerializableTraineeTest {

    private final Trainee trainee = new Trainee("Ivan", "Ivanov", 5);

    public SerializableTraineeTest() throws TraineeException {
    }

    @Test
    public void serializeToFile() throws Exception {
    }

    @Test
    public void deserializeOfFile() throws Exception {
    }

    @Test
    public void serializeToBytes() throws Exception {
        byte [] bytes = trainee.toString().getBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(trainee);
            bos.toByteArray();
        }
        assertEquals(bos.toByteArray().length, Serializable.serializeToBytes(trainee).length);
    }


    @Test
    public void deserializeOfBytes() throws Exception {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(Serializable.serializeToBytes(trainee));
             ObjectInput in = new ObjectInputStream(bis)) {
            assertEquals( (Trainee) in.readObject(), Serializable.deserializeOfBytes(Serializable.serializeToBytes(trainee)) );
        }
    }

    
}
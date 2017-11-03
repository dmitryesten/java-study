package net.thumbtack.denisenko.trainee.io.serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;
import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.File;
import java.io.IOException;

public class JacksonSerializable {

    public static String serializableJackson(Trainee t) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(t);
    }

    public static Trainee deserialiableJackson(String objectSerialized) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(objectSerialized, Trainee.class);
    }

    public static void write(Trainee trainee, File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(file, trainee);
        } catch (IOException e) {
        	// REVU never call printStackTrace, throw exception
            e.printStackTrace();
        }
    }

    public static void read(File file) throws FileException, JsonParseException, JsonMappingException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(file, Trainee.class);
        } catch (IOException e) {
        	// REVU it is not a good idea to throw new FileException() using default constructor
        	// add constructor with inner exception and pass e to it
            throw new FileException();
        }

    }

}

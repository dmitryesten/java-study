package net.thumbtack.denisenko.trainee.io.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;
import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.File;
import java.io.IOException;

public class JacksonSerializable {

    public static String serializableJackson(Trainee trainee) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(trainee);
    }

    public static Trainee deserialiableJackson(String objectSerialized) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(objectSerialized, Trainee.class);
    }

    public static void write(Trainee trainee, File file) throws IOException, FileException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(file, trainee);
        } catch (IOException e) {
            throw new FileException(e.getMessage(), e.getCause());
        }
    }

    public static void read(File file) throws FileException, JsonParseException, JsonMappingException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(file, Trainee.class);
        } catch (IOException e) {
            throw new FileException(e.getMessage(), e.getCause());
        }

    }

}

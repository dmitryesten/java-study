package net.thumbtack.denisenko.trainee.io.serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
            e.printStackTrace();
        }
    }

    public static void read(File file){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        	// REVU JsonParseException, JsonMappingException
            objectMapper.readValue(file, Trainee.class);
        } catch (IOException e) {
        	// REVU do not call printStackTrace, throw your own exception 
            e.printStackTrace();
        }
    }

}

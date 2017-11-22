
package net.thumbtack.denisenko.trainee.io.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class GsonSerializable {

    public static String serialize(Trainee trainee){
        Gson gson = new Gson();
        return gson.toJson(trainee);
    }

    public static Trainee deserialize(String objectSerialized) throws JsonIOException, JsonSyntaxException{
        Gson gson = new Gson();
        return gson.fromJson(objectSerialized, Trainee.class);
    }

    public static void write(Trainee trainee, File file) throws IOException {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(file) , "UTF-8")){
            Gson gson = new GsonBuilder().create();
            gson.toJson(trainee, writer);
        }

    }

    public static void read(File file) throws IOException, JsonIOException, JsonSyntaxException {
        try(Reader reader = new InputStreamReader(new FileInputStream (file))){
            Gson gson = new GsonBuilder().create();
            Trainee t = gson.fromJson(reader, Trainee.class);
        }
    }

}

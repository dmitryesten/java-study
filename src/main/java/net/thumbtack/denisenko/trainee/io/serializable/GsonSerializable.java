package net.thumbtack.denisenko.trainee.io.serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

public class GsonSerializable {

    public static String serialize(Trainee t){
        Gson gson = new Gson();
        return gson.toJson(t);
    }

    public static Trainee deserialize(String objectSerialized){
        Gson gson = new Gson();
        return gson.fromJson(objectSerialized, Trainee.class);
    }

    public static void write(Trainee trainee, File file) throws IOException {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(file) , "UTF-8")){
            Gson gson = new GsonBuilder().create();
            gson.toJson(trainee, writer);
        }

    }

    public static void read(File file) throws IOException {
        try(Reader reader = new InputStreamReader(new FileInputStream (file))){
            Gson gson = new GsonBuilder().create();
            Trainee t = gson.fromJson(reader, Trainee.class);
        }
    }
}

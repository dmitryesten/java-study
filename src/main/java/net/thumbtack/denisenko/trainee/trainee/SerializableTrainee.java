package net.thumbtack.denisenko.trainee.trainee;

import java.io.*;

public class SerializableTrainee {

    public static void serialize(Trainee t, File file) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(t);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void deserialize(File file) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Trainee t = (Trainee) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void serializeToByteArray(Trainee t, File file) throws FileNotFoundException {

    }


}

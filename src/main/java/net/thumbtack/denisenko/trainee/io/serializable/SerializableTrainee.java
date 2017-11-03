package net.thumbtack.denisenko.trainee.io.serializable;

import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;

// REVU bad class name
public class SerializableTrainee {

    public static void serializeToFile(Trainee t, File file) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(t);
        } catch (FileNotFoundException e) {
        	// REVU never call printStackTrace
            e.printStackTrace();
        }
    }


    public static void deserializeOfFile(File file) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Trainee t = (Trainee) ois.readObject();
        } catch (FileNotFoundException e) {
        	// REVU never call printStackTrace
            e.printStackTrace();
        }
    }


    public static byte[] serializeToBytes(Trainee trainee) throws IOException {
    	// REVU put ByteArrayOutputStream into try-with-resource, it must be closed
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutput out = new ObjectOutputStream(bos)) {
                out.writeObject(trainee);
                bos.close();
                return bos.toByteArray();
        }
    }


    public static Trainee deserializeOfBytes(byte[] bytes) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
             ObjectInput in = new ObjectInputStream(bis)) {
            return (Trainee) in.readObject();
        }
    }

}

package net.thumbtack.denisenko.trainee.io.serializable;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;


public class Serializable {

    public static void serializeToFile(Trainee t, File file) throws IOException, FileException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(t);
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }
    }


    public static void deserializeOfFile(File file) throws IOException, ClassNotFoundException, FileException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Trainee t = (Trainee) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is found", e.getCause());
        }
    }


    public static byte[] serializeToBytes(Trainee trainee) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutput out = new ObjectOutputStream(bos) ) {
                out.writeObject(trainee);
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

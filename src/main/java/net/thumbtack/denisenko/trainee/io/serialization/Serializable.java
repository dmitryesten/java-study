package net.thumbtack.denisenko.trainee.io.serialization;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.io.write.FileWriterTrainee;
import net.thumbtack.denisenko.trainee.trainee.Trainee;

import java.io.*;


public class Serializable {

    public static void serializeToFile(Trainee trainee, File file) throws IOException, FileException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(trainee);
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
    }


    public static Trainee deserializeOfFile(File file) throws IOException, ClassNotFoundException, FileException {
        Trainee trainee;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
             trainee= (Trainee) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new FileException("Ops, file is not found", e.getCause());
        }
        return trainee;
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

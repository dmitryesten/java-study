package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.io.serializable.SerializableTrainee;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String [] args) throws TraineeException, IOException {
        File file1 = new File("test.dat");
        File file = new File("test2.dat");
        Trainee t = new Trainee("", "", 5);

        //SerializableTrainee.serialize(t, file);
        //SerializableTrainee.deserialize(file);

        System.out.println(SerializableTrainee.serializeToBytes(t));

    }
    private static String stringToBinary(String s) {
        StringBuilder sourceString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sourceString.append(Integer.toBinaryString(c));
        }
        return sourceString.toString();
    }

}

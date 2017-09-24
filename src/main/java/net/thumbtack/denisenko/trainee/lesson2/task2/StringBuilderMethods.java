package net.thumbtack.denisenko.trainee.lesson2.task2;

public class StringBuilderMethods {

    public static StringBuilder append (StringBuilder sb, String s) {
        return sb.append(s);
    }


    public static StringBuilder insert (int i, String string, StringBuilder sb){
        return sb.insert(i, string);
    }


    public static String toString(StringBuilder stringBuilder){
        return stringBuilder.toString();
    }


}

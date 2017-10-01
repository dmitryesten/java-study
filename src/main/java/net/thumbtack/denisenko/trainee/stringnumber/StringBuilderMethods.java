package net.thumbtack.denisenko.trainee.stringnumber;

public class StringBuilderMethods {

    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("ABC");

        System.out.println(sb.append("EFG"));
        System.out.println(sb.insert(1, "__asdqwe123__"));
        System.out.println(sb.toString());

    }


}

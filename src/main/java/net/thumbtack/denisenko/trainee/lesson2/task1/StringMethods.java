package net.thumbtack.denisenko.trainee.lesson2.task1;

import net.thumbtack.denisenko.trainee.lesson2.task1.StringMethods;

public class StringMethods {



    public static void main( String[] args ){

        char [] arrayStr = new char[10];
        String string = new String("Hello,world!");
        String string2 = new String("Hello,world!");
        String string3 = new String("Hello");
        System.out.println("Length: "+string.length());
        System.out.println("ChartAt: "+string.charAt(1));
        System.out.println("IndexOf: "+ string.indexOf('H') + " LastIndexOf: " + string.lastIndexOf(','));
        System.out.println("Equals: "+string.equals(string2) + ", "+ string.equals(string3));
        System.out.println("EqualsIgnoreCase: "+ string.equalsIgnoreCase(string2));
        System.out.println("CompareTo: "+ string.compareTo(string2) + "\r\n" +"CompareToIgnoreCase: "+string.compareToIgnoreCase(string2));
        System.out.println("Concat: "+ string.concat(" HW"));
        System.out.println("+: "+ string +" "+ string2);
        System.out.println("+=: "+ string +" "+ string2);
        System.out.println("StartsWith: "+ string.startsWith("Hel") + "; EndsWith: "+string.endsWith("!"));
        System.out.println("Substring: "+string.substring(1, 6));
         string.getChars(0,6, arrayStr, 0);
        System.out.println("GetBytes: "+string.getBytes());
        System.out.print("GetChars: "); for (char i: arrayStr) { System.out.print(i); }


        System.out.println("\r\nReplace: "+ string.replace('!', '?'));
        System.out.println("ReplaceFirst: "+ string.replaceFirst("[l]", "LL"));
        System.out.println("Split: "+ string.split("asd"));


        StringBuilder stringBuilder = new StringBuilder("Check,string");
        System.out.println("Append: "+ stringBuilder.append("asd"));










    }

}

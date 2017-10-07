package net.thumbtack.denisenko.trainee.figure;

public enum Color {
    RED, GREEN, BLUE, YELLOW, WHITE, BLACK;

    public static Color colorFromString(String strColor){
        String s = "";
        while(strColor.toUpperCase().equals(Color.values())){
            s = strColor.toUpperCase();
        }
        return Color.valueOf(s);
    }
}

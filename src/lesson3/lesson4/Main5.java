package lesson3.lesson4;

public class Main5 {
    public static void main(String[] args) {
        String text = " I am,  lerning  Java.";
        String text1 = text.replace(',', ' ');
        String text2 = text1.replace("  ", " ");
        String text3 = text2.replace("!", " ");
        String text4 = text3.replace(".", "");

        String[] inMassiv = text4.split("");



//        String [] inMassiv = text.split("m");
        for (String i: inMassiv) {
            System.out.println(i);
        }
    }
}

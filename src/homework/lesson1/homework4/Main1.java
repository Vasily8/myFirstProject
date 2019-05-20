package homework.lesson1.homework4;

public class Main1 {
    public static void main(String[] args) {
        String text = " I am happy to learning Java";
        String[] inMassiv = text.split(" ");

        for (int i = inMassiv.length - 1; i >= 0; i--) {

            System.out.println(inMassiv[i]);
        }

    }
}

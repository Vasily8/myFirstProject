package homework.lesson1.homework6;

public class StringUtils {

    public static String reverse(String text) { //метод текста в обратном порядке

        String[] inMassiv = text.split("");

        for (int i = inMassiv.length - 1; i >= 0; i--) {

            System.out.println(inMassiv[i]);
        }
        return text;

    }

    public static int countGlass(String text) {  // метод с гласными буквами
        char[] toText = text.toCharArray();

        int glass = 0;

        for (int i = 0; i < toText.length; i++) {
            char newChar = toText[i];
            if (newChar == 'b' || newChar == 'c' || newChar == 'd' || newChar == 'f' || newChar == 'g' ||
                    newChar == 'h' || newChar == 'j' || newChar == 'l' || newChar == 'm' || newChar == 'n'
                    || newChar == 'p' || newChar == 'q' || newChar == 'r' || newChar == 's' || newChar == 't'
                    || newChar == 'v' || newChar == 'w' || newChar == 'x' || newChar == 'y' || newChar == 'z'

                    || newChar == 'B' || newChar == 'C' || newChar == 'D' || newChar == 'F' || newChar == 'G' ||
                    newChar == 'H' || newChar == 'J' || newChar == 'L' || newChar == 'M' || newChar == 'N'
                    || newChar == 'P' || newChar == 'Q' || newChar == 'R' || newChar == 'S' || newChar == 'T'
                    || newChar == 'V' || newChar == 'W' || newChar == 'X' || newChar == 'Y' || newChar == 'Z') {
                glass++;
            }

        }
        System.out.println("Гласных букв в тексте " + glass);
        return glass;
    }


    public static int countSoglasnie(String text) {  // метод с согласными буквами
        char[] toText = text.toCharArray();

        int soglas = 0;

        for (int i = 0; i < toText.length; i++) {
            char newChar = toText[i];
            if (newChar == 'a' || newChar == 'o' || newChar == 'e' || newChar == 'i' || newChar == 'u' ||
                    newChar == 'A' || newChar == 'O' || newChar == 'E' || newChar == 'I' || newChar == 'U') {
                soglas++;
            }

        }
        System.out.println("Согласных букв в тексте " + soglas);
        return soglas;
    }


}

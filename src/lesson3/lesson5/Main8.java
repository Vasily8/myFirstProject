package lesson3.lesson5;

public class Main8 {
    public static void main(String[] args) {
        String text = "Language java";
        char [] charFromText = text.toCharArray();
        String alfavit = "abcdefghijk";
        for (int i = 0; i < charFromText.length; i++) {
            System.out.println(charFromText[i] + " - " + alfavit.indexOf(charFromText[i]));

        }
    }

}

package lesson3.lesson6;

public class Main3 {
    public static void main(String[] args) {
        String text1 = "java";
        String text2 = "programming";

        for (int i = 0; i< text1.length(); i++) {
            for (int j = 0; j<text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j) && text1.charAt(i) != ' '){
                    System.out.println(text1.charAt(i));
                }
            }

        }

    }
}

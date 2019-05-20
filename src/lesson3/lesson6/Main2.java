package lesson3.lesson6;

public class Main2 {
    public static void main(String[] args) {
        String text1 = "java";
        String text2 = "programming";

        char[] charFrontext1 = text1.toCharArray();
        char[] charFrontext2 = text2.toCharArray();

        for (int i = 0; i< charFrontext1.length; i++) {
            for (int j = 0; j<charFrontext2.length; j++) {
                if (charFrontext1[i] == charFrontext2 [j]) {
                    System.out.println(charFrontext1[i]);
                }



            }

        }

    }
}

package lesson3.lesson6;

public class Main1 {
    public static void main(String[] args) {
        String text = "Every day I learn java.";
        char [] word = text.toCharArray();

        char[] charsFromText = text.toCharArray(); // перевели в массив

        int coutGlas = 0;
        int coutSoglas = 0;
        int coutSimvols = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            char currentChar = charsFromText[i]; // скинули массив в определенную переменную

            if (currentChar == ' ') {
                continue; // переходит на следущий круг этерации.
            } else if (currentChar == ' ') {
                continue; // переходит на следущий круг этерации.
            } else if (currentChar == 'a' || currentChar == 'o' || currentChar == 'A') {
                coutGlas++;
            } else if (currentChar == '.' || currentChar == ',' || currentChar == '!') {
                coutSimvols++;
            }
        }
        System.out.println("Гласных в тексте" + coutGlas);
        System.out.println("Cогласных в тексте" + coutSoglas);
        System.out.println("Символов в тексте" + coutSimvols);



    }
}
package homework.lesson1.homework5;

public class Main1 {
    public static void main(String[] args) {
        String text = "Every day I learn java.";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] signs = ",.!:".toCharArray();
        int[] coutVolowels = new int[vowels.length];
        int[] coutConsonats = new int[consonants.length];
        int[] coutSigna = new int[signs.length];

        for (int i = 0; i < vowels.length; i++) {
            int coutCarrentVolowes = 0;
            for (int j = 0; j < text.length(); j++) {
                if (vowels[i] == text.charAt(j)) {
                    coutCarrentVolowes++;
                }

                coutVolowels[i] = coutCarrentVolowes;
            }

        }

        for (int i = 0; i < consonants.length; i++) {
            int coutCarrentConsonats = 0;
            for (int j = 0; j < text.length(); j++) {
                if (consonants[i] == text.charAt(j)) {
                    coutCarrentConsonats++;
                }

                coutConsonats[i] = coutCarrentConsonats;
            }

        }
        for (int i = 0; i < signs.length; i++) {
            int coutCarrentSigns = 0;
            for (int j = 0; j < text.length(); j++) {
                if (consonants[i] == text.charAt(j)) {
                    coutCarrentSigns++;
                }

                coutSigna[i] = coutCarrentSigns;
            }

        }

        System.out.println("Количество гласных букв:");

        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + "-" + coutVolowels[i]);
        }
        System.out.println("Количество cогласных букв:");

        for (int i = 0; i < consonants.length; i++) {
            System.out.println(consonants[i] + "-" + coutConsonats[i]);
        }
        System.out.println("Количество знаков препинания:");

        for (int i = 0; i < signs.length; i++) {
            System.out.println(signs[i] + "-" + coutSigna[i]);
        }
    }
}


package lesson3.lesson5;

public class Main3 {
    public static void main(String[] args) {
        String text = " I like to learn java";
        char[] alfavit = "abcdefghijk".toCharArray();// засунули алфавит в массив;

        int[] cout = new int[alfavit.length]; // перевели алфавит в интувую переменную;
                                      // завели пустую переменную
        for (int i = 0; i < alfavit.length; i++) { // выыели алфавит по всей длине
            int coutCarrentChar = 0;
            for (int j = 0; j < text.length(); j++) {  // вывели текст по всей длине
                if (alfavit[i] == text.charAt(j)) { // метод достает по каждой букве
                    coutCarrentChar++;
                }

                cout[i] = coutCarrentChar;
            }

        }

        for (int i = 0; i<alfavit.length; i++) {
            System.out.println(alfavit[i] + "-" + cout [i]);
        }

    }
}

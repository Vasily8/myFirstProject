package lesson3.lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text ="   qwerty";
        String result = text.toUpperCase(); // но он не стал большими буквами, и мы должны положить в новую переменную
        System.out.println(result);

        String result2 = text.trim();
        System.out.println(result2);
    }
}

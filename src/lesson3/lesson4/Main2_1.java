package lesson3.lesson4;

public class Main2_1 {
    public static void main(String[] args) {
        String text = "tregdg";
        char [] toMassive = text.toCharArray();

        for (int i = 0; i<toMassive.length; i++){
            if (toMassive[i] == 'a' ||  toMassive[i] == 'o' || toMassive[i] == 'g') {
                char result = toMassive[i];
                System.out.println(result);
            }

        }




}
}
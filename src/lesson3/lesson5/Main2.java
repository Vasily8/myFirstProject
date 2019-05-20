package lesson3.lesson5;

public class Main2 {
    public static void main(String[] args) { // д/з 4
        char [] arr = {'a', 'b', 'c', 'd'};
        char [] arr2 = {'q', 'w', 'e', 'r'};

        char [] arrB = {'A', 'B', 'C', 'D'};
        char [] arrB2 = {'Q', 'W', 'E', 'R'};

        String text = "Are you ready to start studying of programming?";

        char[] massive = text.toCharArray(); // текст сделали массивом

        for (int i = 0; i < text.length(); i++){ //вывели весь текст
            for (int j = 0; j < arr.length; j++) { //вывели весь массив
                if (massive [i] == arr[j]) {
                    massive [i] = arr2[j];
                }

            }

        }
        for (int i = 0; i < text.length(); i++){
            for (int j = 0; j < arrB.length; j++) {
                if (massive[i] == arrB[j]) {
                    massive[i] = arrB2[j];
                }
            }
        }

        System.out.println(massive);
    }
}

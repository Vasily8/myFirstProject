package lesson3.lesson5;

public class Main1 {  // 3-e д/з
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        char [] arr2 = new char[arr.length];

//        arr2 [0] = arr [3];
//        arr2 [0] = arr [2];
//        arr2 [0] = arr [1];
//        arr2 [0] = arr [0];

        int j = arr.length - 1;


        for (int i =0; i<arr.length; i++) {
            arr2 [i] = arr [3];
            j--;

        }
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}

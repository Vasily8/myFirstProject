package homework.lesson1.homework7;

public class Main1 {
    public static void main(String[] args) {

        int[][] massive = new int[4][4];

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (i == j) {
                    System.out.print(massive[i][j] + " ");
                } else if (j < i) {
                    System.out.print(massive[j][i] + " ");
                } else {
                    System.out.print(" " + " ");
                }


            }
            System.out.println();
        }


    }
}

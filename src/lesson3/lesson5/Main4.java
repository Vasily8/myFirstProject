package lesson3.lesson5;

public class Main4 {
    public static void main(String[] args) {
        int[] massive = {1, 3, 88, 22, 15};
        int biGest = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > biGest) {
                biGest = massive[i];

            }
        }
        System.out.println(biGest);

        int big = 0;
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] > big && massive[j] < biGest) {
                big = massive[j];

            }
        }
        System.out.println(big);

    }
}

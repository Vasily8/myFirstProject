package lesson3.lesson8;

public class Main3 {
    public static void main(String[] args) {
        String massiv1 = "Великий";
        String massiv2 = "Добрый";
        String massiv3 = "Величайший";


        char[] mas1 = massiv1.toCharArray();
        char[] mas2 = massiv2.toCharArray();
        char[] mas3 = massiv3.toCharArray();


        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                for (int t = 0; t < mas3.length; t++) {
                    if (mas1[i] == mas2[j]) {
                        char result = mas1[i];
                        if (result == mas3[t]){
                            System.out.println(mas3[t]);
                        }

                    }
                }
            }

        }
        Main4.rashetZarplati(50000);
        Main4.rashetZp2(50000);
    }
}


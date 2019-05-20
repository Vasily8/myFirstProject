package lesson3.lesson8;

public class Main2 {
    public static void main(String[] args) {
        String massiv1 = "Великий";
        String massiv2 = "Добрый";
        String massiv3 = "Величайший";

        for (int i = 0; i < massiv1.length(); i++){
            for (int j = 0; j < massiv2.length(); j++){
                for (int t = 0; t < massiv3.length(); t++){
                 if (massiv1.charAt(i) == massiv2.charAt(j)){
                     char result = massiv1.charAt(i);
                     if (result == massiv3.charAt(t)){
                         System.out.println(massiv3.charAt(t));
                     }
                 }
                }
            }
        }




            }
        }




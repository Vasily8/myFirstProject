package lesson3.lesson8;

public class Metod {

    public static int massiveChiselBy5(int[]chisla){
        int chislo5 = 0;
        for (int i = 0; i<chisla.length; i++){
            if (chisla[i] % 5 == 0){
                chislo5 = chisla[i];
            }

        }
        return chislo5;

    }
    public static String sravnBukv(String text1, String text2){
        char[]charText1 = text1.toCharArray();
        char[]charText2 = text2.toCharArray();

        String wordText = "";

        for (int i = 0; i<charText1.length; i++){

            for (int j = 0; j<charText2.length; j++){
                if (charText1[i]==charText2[j]){
                    wordText += charText1[i];
                    break;

                }
            }
        }
        return wordText;
    }


}
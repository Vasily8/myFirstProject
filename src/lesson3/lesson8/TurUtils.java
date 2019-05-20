package lesson3.lesson8;

public class TurUtils {

    public static void tourPrint(String[][] tour,String coutry){
        for (int i = 0; i<tour.length; i++){
            if (tour[i][0].equals(coutry)){
                System.out.println(tour[i][0] + tour[i][1] + tour[i][2] + tour[i][3]);

            }
        }
    }



    public static void printVeryExpensiveTour(String [][] tours){
        int priceMax = 0;
        for (int i = 0; i<tours.length; i++){
            int priceNum = Integer.parseInt(tours[i][1]);
            if (priceNum > priceMax) {
                priceMax = priceNum;
            }

        }
        System.out.println(priceMax);

    }
    public static void allEveregeTour (String [][] tours) {
        int allEv = 0;
        for (int i = 0; i <tours.length; i++){
            int tours2 = Integer.parseInt(tours[i][1]);
            allEv = allEv + tours2;
        }
        System.out.println(allEv);
    }




}

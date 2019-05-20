package homework.lesson1.homework6;


public class IntUtils {

    public static void triangle(double sideOne, double sideTwo, double sideThree) { //1. метод площади треугольника

        double square = ((sideOne + sideTwo + sideThree) / 2);

        System.out.println("Площадь треугольника равна : " + Math.sqrt(square * (square - sideOne) * (square - sideTwo) * (square - sideThree)));


    }

    public static void massivChisel(int[] number) { //2.метод массива четных чисел
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]+" Это четное число");
            }

        }
    }
//3.метод сложения дробей
    public static void summaChiclitelZhamenatel(int chislit1, int chislit2, int znamtnatel1, int znamtnatel2) {
        int summ1 = (chislit1*znamtnatel2) + (chislit2 * znamtnatel1);
        int summ2 = (znamtnatel1 * znamtnatel2);

        System.out.println("Числитель равен "+summ1);
        System.out.println("Знаменатель равен "+summ2);



    }
}

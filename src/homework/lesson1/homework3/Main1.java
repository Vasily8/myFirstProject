package homework.lesson1.homework3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите длину прямоугольника");
        int sideOne = scanner.nextInt();


        System.out.println("Ведите ширину прямоугольника");
        int sideTwo = scanner.nextInt();


        System.out.println("Если вы хотите узнать площадь ведите слово - площадь ");
        System.out.println("Если периметр ведите слово - периметр ");
        System.out.println("Если площадь и периметр ведите слово - все ");

        String action = scanner.next();

        if (action.equals("площадь")) {
            if (sideOne != sideTwo) {
                System.out.println("Площадь прямоугольника равна " + (sideOne * sideTwo));
            } else {
                System.out.println("Прямоугольник не должен иметь такие параметры, ведите другие параметры");
            }
        } else if (action.equals("периметр")) {
            if (sideOne != sideTwo) {
                System.out.println("Периметр прямоугольника равен " + (sideOne + sideTwo * 2));
            } else {
                System.out.println("Прямоугольник не должен иметь такие параметры, ведите другие параметры");
            }
        } else if (action.equals("все")) {
            if (sideOne != sideTwo) {
                System.out.println("Площадь прямоугольника равна " + (sideOne * sideTwo));
                System.out.println("Периметр прямоугольника равен " + (sideOne + sideTwo * 2));
            } else {
                System.out.println("Прямоугольник не должен иметь такие параметры, ведите другие параметры");
            }
        } else {
            System.out.println("Ведите данные заново, вы вели данные квадрата");

        }


    }
}

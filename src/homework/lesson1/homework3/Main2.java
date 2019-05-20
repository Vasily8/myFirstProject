package homework.lesson1.homework3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите радиус круга");
        int radius = scanner.nextInt();

        System.out.println("Если вы хотите узнать площадь ведите слово - площадь ");
        System.out.println("Если периметр ведите слово - периметр ");
        System.out.println("Если площадь и периметр ведите слово - все ");

        String action = scanner.next();

        if (action.equals("площадь")) {
            System.out.println("Площадь круга равна " + (radius * radius) * 3.1415);

        } else if (action.equals("периметр")) {
            System.out.println("Периметр круга равен " + (2 * radius * 3.1415));

        } else if (action.equals("все")) {
            System.out.println("Площадь круга равна " + (radius * radius) * 3.1415);
            System.out.println("Периметр круга равен " + (2 * radius * 3.1415));

        } else {
            System.out.println("Веденное вами слово не соответствует вышеуказанным словам");

        }


    }
}

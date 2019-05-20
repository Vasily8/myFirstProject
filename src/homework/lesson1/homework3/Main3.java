package homework.lesson1.homework3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите длину 1-ого основания трапеции ");
        int lengthOne = scanner.nextInt();


        System.out.println("Ведите длину 2-ого основания трапеции");
        int lengthTwo = scanner.nextInt();


        System.out.println("Ведите длину высоты трапеции");
        int heightLength = scanner.nextInt();

        System.out.println("Ведите длину боковой стороны трапеции");
        int sideOne = scanner.nextInt();

        System.out.println("Ведите длину боковой стороны трапеции");
        int sideTwo = scanner.nextInt();


        System.out.println("Если вы хотите узнать площадь ведите слово - площадь ");
        System.out.println("Если периметр ведите слово - периметр ");
        System.out.println("Если площадь и периметр ведите слово - все ");

        String action = scanner.next();

        if (action.equals("площадь")) {
            System.out.println("Площадь трапеции  = " + (sideOne * sideTwo));

        } else if (action.equals("периметр")) {
            System.out.println("Периметр трапеции  = " + (lengthOne + lengthTwo + sideOne + sideTwo));

        } else if (action.equals("все")) {
            System.out.println("Площадь трапеции  = " + ((lengthOne + lengthTwo) / 2) * heightLength);
            System.out.println("Периметр трапеции  = " + (4 * sideOne));

        } else {
            System.out.println("Веденное вами слово не соответствует вышеуказанным словам");

        }

    }
}

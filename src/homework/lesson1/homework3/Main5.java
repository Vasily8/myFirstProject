package homework.lesson1.homework3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите длину ромба");
        int sideOne = scanner.nextInt();


        System.out.println("Ведите высоту ромба");
        int sideTwo = scanner.nextInt();


        System.out.println("Если вы хотите узнать площадь ведите слово - площадь ");
        System.out.println("Если периметр ведите слово - периметр ");
        System.out.println("Если площадь и периметр ведите слово - все ");

        String action = scanner.next();

        if (action.equals("площадь")) {
            System.out.println("Площадь ромба  = " + (sideOne * sideTwo));

        } else if (action.equals("периметр")) {
            System.out.println("Периметр ромба  = " + (4 * sideOne));

        } else if (action.equals("все")) {
            System.out.println("Площадь ромба  = " + (sideOne * sideTwo));
            System.out.println("Периметр ромба  = " + (4 * sideOne));

        } else {
            System.out.println("Веденное вами слово не соответствует вышеуказанным словам");

        }


    }

}


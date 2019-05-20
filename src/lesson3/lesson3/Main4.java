package lesson3.lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String inputName = scanner.nextLine(); // Стринговые значения считываються и кладуться в переменную
        System.out.println("Привет " + inputName);


        System.out.println("Ведите первую сторону треугольника");
        int storonaA = scanner.nextInt(); // Интовые значения считываються и кладуться в переменную


        System.out.println("Ведите вторую сторону треугольника");
        int storonaB = scanner.nextInt();

        System.out.println("Ведите третью сторону треугольника");
        int storonaC = scanner.nextInt();

        System.out.println("Площадь или периметр");

        String action = scanner.next();

        if (action.equals("периметр")){ // если текст который будет веден, равняется этому слову
            System.out.println("Периметр треугольника  = " + (storonaA + storonaB + storonaC));

        }
        else {

        }


    }
}

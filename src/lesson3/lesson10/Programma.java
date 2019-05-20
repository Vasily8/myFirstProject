package lesson3.lesson10;


import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Ведите название фигуры");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();

        Figura figura = null;// Создали ссылочку на фигуру

        if (inputFigura.equals(1)){
            System.out.println("Ведите сторону А");
            String storonaA = scanner.nextLine();

            System.out.println("Ведите сторону B");
            String storonaB = scanner.nextLine();

            System.out.println("Ведите сторону C");
            String storonaC = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);

            figura = new Treugolnic(stA, stB, stC);// на переменную фигура, мы ложим треугольник с тремя сторонами.


        }
        if (inputFigura.equals(2)){
            System.out.println("Ведите сторону А");
            String storonaA = scanner.nextLine();

            System.out.println("Ведите сторону B");
            String storonaB = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);

            figura = new Priamougolnic(stA, stB);
        }

        System.out.println("Периметр или Площадь");

        String imputActiv = scanner.nextLine();

        if (imputActiv.equals("площадь")) {
            figura.printPloshad();

        }
        else {
            figura.printPerimtr();

        }



    }
}

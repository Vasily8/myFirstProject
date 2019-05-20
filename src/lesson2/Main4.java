package lesson2;

public class Main4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 2;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это точно не равносторонний треугольник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
            if ((a == b && b != c) || (b == c && c != a) || ( c == a && a != b)) {
                System.out.println("Это равнобедренный треугольник");

            }
        }
    }


package lesson3.lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String login = "qwerty";
        String pasword = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите логин");
        String imputlogin = scanner.nextLine();

        System.out.println("Ведите пароль ");
        String inputPasword = scanner.nextLine();

        if (login.equalsIgnoreCase(imputlogin) && pasword.equals(inputPasword)) {
            System.out.println("Вход выполнен");
        }
        else {
            System.out.println("Неверно ");
        }




    }
}

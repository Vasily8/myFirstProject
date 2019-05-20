package lesson3.lesson7;

import java.util.Scanner;

public class Calculator {
    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String inputAction = scanner.nextLine();
        if (inputAction.equals("-") || inputAction.equals("+") || inputAction.equals("*") || inputAction.equals("/")) {
            return inputAction;

        } else {
            System.out.println("Неверное действие повторите ввод");
            // вызов метода внутри самого себя
            return Calculator.getOperation();
        }
    }

    public static int getNamber() {
        Scanner scanner = new Scanner(System.in);
        String inputNamber = scanner.nextLine();
        char[] charSimvolFromNamber = inputNamber.toCharArray();
        for (int i = 0; i < charSimvolFromNamber.length; i++) {
            if (charSimvolFromNamber[i] != '0' && charSimvolFromNamber[i] != '1' && charSimvolFromNamber[i] != '2' && charSimvolFromNamber[i] != '3' &&
                    charSimvolFromNamber[i] != '4' && charSimvolFromNamber[i] != '5' && charSimvolFromNamber[i] != '6' && charSimvolFromNamber[i] != '7' &&
                    charSimvolFromNamber[i] != '8' && charSimvolFromNamber[i] != '9') {
                System.out.println("Неверное число");
                return Calculator.getNamber();
            }

        }

        int num = Integer.parseInt(inputNamber);   // Преобразование в int
        return num;
    }

    public static void printResult(String operation, int num1, int num2) {
        if (operation.equals("+")) {
            System.out.println("Результат сложения = " + (num1 + num2));
        }
        if (operation.equals("-")) {
            System.out.println("Результат вычитания = " + (num1 - num2));
        }
        if (operation.equals("*")) {
            System.out.println("Результат умножения = " + (num1 * num2));
        }
        if (operation.equals("/")) {
            System.out.println("Результат деления = " + (num1 / num2));
        }

    }
}










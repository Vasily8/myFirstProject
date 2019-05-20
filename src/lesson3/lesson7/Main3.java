package lesson3.lesson7;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Каукую опперацию необходимо сделать? ");
        String operation = Calculator.getOperation();
        System.out.println(operation);

        System.out.println("Ведите первое число:");
        int num1 = Calculator.getNamber();

        System.out.println("Ведите второе число:");
        int num2 = Calculator.getNamber();

        Calculator.printResult(operation, num1, num2);


    }
}

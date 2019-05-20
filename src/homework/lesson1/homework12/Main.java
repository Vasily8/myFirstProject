package homework.lesson1.homework12;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(1,4); //Назначили с помощью конструктора с 2-мя параметрами

        FractionNumberImpl number2 = new FractionNumberImpl();
        number2.setDividend(3);
        number1.setDivisor(5); // назначили данные с помощью гетеров и сетеров

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        FractionNumber resultAdd = operation.add(number1, number2);
        resultAdd.printToConsol();

        FractionNumber resultSub = operation.sub(number1, number2);
        resultSub.printToConsol();


        FractionNumber resultMul = operation.mul(number1, number2);
        resultMul.printToConsol();

        FractionNumber resultDiv = operation.div(number1, number2);
        resultDiv.printToConsol();


    }
}

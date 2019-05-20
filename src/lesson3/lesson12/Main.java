package lesson3.lesson12;

public class Main {
    public static void main(String[] args) {
        FractionNamberImpl namber1 = new FractionNamberImpl(1,4);
        FractionNamberImpl namber2 = new FractionNamberImpl();
        namber2.setDividend(3);
        namber2.setDivisor(5);

        PractionNamberOperationImpl operation = new PractionNamberOperationImpl();

        FractionNumber resultAdd = operation.add(namber1, namber2);

        resultAdd.printToConsol();

        FractionNumber resultAdd2 = operation.sub(namber1,namber2);
        resultAdd2.printToConsol();

        


    }
}

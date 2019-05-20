package homework.lesson1.homework12;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {

        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisla = (a.getDividend()* b.getDivisor()) + (b.getDividend() *a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisla);
        result.setDivisor(commonDivisor);


        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {

        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisla = (a.getDividend()* b.getDivisor()) - (b.getDividend() *a .getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisla);
        result.setDivisor(commonDivisor);


        return result;

    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {

        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisla = a.getDivisor() * b.getDivisor();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisla);
        result.setDivisor(commonDivisor);


        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int commonDivisor = a.getDivisor() * b.getDividend();
        int resultChisla = a.getDividend() * b.getDivisor();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisla);
        result.setDivisor(commonDivisor);


        return result;
    }
}

package lesson3.lesson12;

public class PractionNamberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {

        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChislitel = (a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor());

        FractionNamberImpl result = new FractionNamberImpl();
        result.setDividend(resultChislitel);
        result.setDivisor(commonDivisor);

        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}

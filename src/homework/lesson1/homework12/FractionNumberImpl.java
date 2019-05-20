package homework.lesson1.homework12;

public class FractionNumberImpl implements FractionNumber {

    private int dividend;
    private int divisor;

    public FractionNumberImpl() {
    }

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;

    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;

    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return dividend / (double) divisor; // Преобразование в один тип данных (double), т.к. были разные типы данных
    }

    @Override
    public void printToConsol() {
        System.out.println(dividend + "/" + divisor);

    }
}

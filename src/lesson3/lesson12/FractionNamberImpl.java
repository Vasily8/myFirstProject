package lesson3.lesson12;

public class FractionNamberImpl implements FractionNumber {

    private int divident;
    private int divisor;

    public FractionNamberImpl() {
    }

    public FractionNamberImpl(int divident, int divisor) {
        this.divident = divident;
        this.divisor = divisor;
    }


    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;
        this.divisor = divisor;

    }

    @Override
    public int getDividend() {
        return divident;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;

    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return divident / (double) divisor;
    }

    @Override
    public void printToConsol() {
        System.out.println(divident + "/" + divisor);
    }


}

package homework.lesson1.homework8;

public class Triangle {
    private int sOne;
    private int sTwo;
    int summ2;

    public int getsOne() {
        return sOne;
    }

    public void setsOne(int sOne) {
        this.sOne = sOne;
    }

    public int getsTwo() {
        return sTwo;
    }

    public void setsTwo(int sTwo) {
        this.sTwo = sTwo;
    }

    public Triangle(int sOne, int sTwo) {
        this.sOne = sOne;
        this.sTwo = sTwo;

    }
    public void summTriangl (int sOne, int sTwo){

        summ2 = sOne*sTwo;

        System.out.println(summ2);

    }
}

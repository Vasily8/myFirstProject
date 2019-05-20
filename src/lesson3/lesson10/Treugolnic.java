package lesson3.lesson10;

public class Treugolnic extends Figura  {
    private int a;
    private int b;
    private int c;

    public Treugolnic() {
    }

    public Treugolnic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void printPerimtr() {
        System.out.println("Площадь треугольника " + (a + b + c));
    }

    @Override
    public void printPloshad() {
        System.out.println("Периметр треугольника " + (a * b * c));

    }
}

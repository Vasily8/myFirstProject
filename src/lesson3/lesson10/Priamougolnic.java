package lesson3.lesson10;

public class Priamougolnic extends Figura {
    private int a;
    private int b;

    public Priamougolnic() {
    }

    public Priamougolnic(int a, int b) {
        this.a = a;
        this.b = b;
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

    @Override
    public void printPerimtr() {
        System.out.println("Площадь прямоугольника " + (a * b));
    }

    @Override
    public void printPloshad() {
        System.out.println("Периметр прямоугольника " + (a + b)* 2);
    }
}

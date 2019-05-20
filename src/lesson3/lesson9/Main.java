package lesson3.lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setDiagonal(1.5);
        saomi.setDiagonal(3.2);
        System.out.println(saomi.getDiagonal());
        System.out.println(meizu.getDiagonal());

        meizu.setModel("S1");
        saomi.setModel("M5");
        System.out.println(saomi.getModel());
        System.out.println(meizu.getModel());

        meizu.setPrice(20000);
        saomi.setPrice(30000);
        System.out.println(saomi.getPrice());
        System.out.println(meizu.getPrice());



    }
}

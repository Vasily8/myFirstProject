package lesson3.lesson11;

public class Monkey extends ZooAnimal {

    public Monkey() {
        super();

    }

    public Monkey(int cost, int weght) {
        super(cost, weght);
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void vois() {
        System.out.println("YAAAAaa");

    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Тигр с такой то стоимостью" + this.getCost());
    }
}

package lesson3.lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {
        super();

    }

    public Popugay(int cost, int weght) {
        super(cost, weght);
    }

    public Popugay (int cost) {
        super(cost);
    }
    @Override
    public void vois() {
        System.out.println("Пвпфвпыфпы");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Тигр с такой то стоимостью" + this.getCost());
    }
}

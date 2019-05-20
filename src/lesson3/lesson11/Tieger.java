package lesson3.lesson11;

public class Tieger extends ZooAnimal {


    public Tieger() {
        super();

    }

    public Tieger(int cost, int weght) {
        super(cost, weght);
    }

    public Tieger(int cost) {
        super(cost);
    }


    @Override
    public void vois() {
        System.out.println("dgdagsaffs");
    }


    @Override
    public void jump() {
        System.out.println("Тигр прыгает");


    }

    @Override
    public void printInfo() {
        System.out.println("Тигр с такой то стоимостью" + this.getCost() + "Вес = "+ this.getWeght());
    }
}
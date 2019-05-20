package lesson3.lesson11;

public abstract class ZooAnimal {

    private int cost;
    private int weght;


    public ZooAnimal() {
    }

    public ZooAnimal(int cost, int weght) {
        this.cost = cost;
        this.weght = weght;
    }

    public ZooAnimal(int cost) {
        this.cost = cost;
    }



    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    public abstract void vois ();

    public abstract void jump ();

    public abstract void printInfo();
}

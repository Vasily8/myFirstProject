package lesson3.lesson11;

public class Zoo {
    private int money;
    private ZooAnimal [] animals = new ZooAnimal[10];

    public Zoo () {

    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ZooAnimal[] getAnimals() {
        return animals;
    }

    public void setAnimals(ZooAnimal[] animals) {
        this.animals = animals;
    }

    public void buyAnimal (ZooAnimal animal) {
        if (money < animal.getCost()) {
            System.out.println("Недостаточно суммы, чтоб купить это животное");
            return;
        }

        money = money - animal.getCost();
        for (int i = 0; i<animals.length; i++){
            money = money +animal.getCost();
            if (animals[i] == null) {
                animals [i] = animal;
                break;

            }
        }
        System.out.println("Нет свободных клeток!!!");

    }

    public void printAnimal (){
        for (int i = 0; i<animals.length; i++){
            if (animals != null){
                animals[i].printInfo();
            }
        }


    }
    public void voice () {
        for (int i = 0; i < animals.length; i++) {
            if (animals != null) {
                animals[i].vois();
            }

        }
    }

    public void moneyExptnsive (){

        ZooAnimal maxCostAnimal = animals[0];

        for (int i = 0; i < animals.length; i++){
            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals [i].getCost()) {
                    maxCostAnimal = animals[i];

                }
            }
        }
        System.out.println("Самое дорогое животное");
        maxCostAnimal.printInfo();

    }

    public void allAnimsls (){
        int summa = 0;
        for (int i = 0; i < animals.length; i++){
            if (animals[i] != null) {
                summa = summa +animals[i].getCost();

            }
        }

        System.out.println(summa);
    }

    public void moneyСheap () {

        ZooAnimal minCostAnimal = animals[0];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (minCostAnimal.getCost() > animals[i].getCost()) {
                    minCostAnimal = animals[i];

                }
            }
        }


    }
    public void summZoo (){
        System.out.println("Зарплата зоопарка составили "+ money);


    }
}

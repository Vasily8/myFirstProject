package lesson3.lesson11;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(1000000);

        Tieger tieger = new Tieger(20000);
        Popugay popugay1 = new Popugay(40000);
        Popugay popugay2 = new Popugay(50000);
        Monkey monkey = new Monkey(1200);
        Monkey monkey1 = new Monkey(1200);

        Tieger tieger2 = new Tieger(3);
        Popugay popugay3 = new Popugay(40000);
        Popugay popugay4 = new Popugay(50000);
        Monkey monkey2 = new Monkey(1200);
        Monkey monkey3 = new Monkey(1200);

        zoo.buyAnimal(popugay1);
        zoo.buyAnimal(popugay2);
        zoo.buyAnimal(monkey);
        zoo.buyAnimal(tieger);
        zoo.buyAnimal(monkey1);

        zoo.printAnimal();

        zoo.voice();
        zoo.moneyExptnsive();
        zoo.allAnimsls();

        zoo.moneyСheap();

        zoo.summZoo();


        }
    }


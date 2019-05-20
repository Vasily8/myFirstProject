package lesson3.lesson9;

public class Main1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setAge(12);
        cat.setDlinaHvosta(3);
        cat.setPoroda("Siam");


        Cat cat1 = new Cat(12,"dfdsf",1.5);
        Cat cat2 = new Cat(4,"впв",1.8);
        cat2.setDlinaHvosta(100);

        System.out.println(cat2.getDlinaHvosta());



    }
}

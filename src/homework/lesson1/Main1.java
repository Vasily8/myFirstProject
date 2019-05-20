package homework.lesson1;

public class Main1 {
    public static void main(String[] args) {
        int allMoney = 1000;
        int pizza = 230;
        int gum = 26;
        float candies = 2.5f;
        // assign variables
        int remainderPizza = allMoney % pizza;
        int remainderGum = remainderPizza % gum;
        float remainderCandits = remainderGum % candies;
        // get the remainder of the division
        int quantityPizza = (allMoney - remainderPizza) / pizza;
        int quantityGum = (remainderPizza - remainderGum) / gum;
        float quantityCandits = (remainderGum - remainderCandits) / candies;
        // get quantity

        System.out.println("На эти деньги мы можем купить" + " " + quantityPizza + " пиццы, " + quantityGum + " жвачки " + quantityCandits + " конфет.");

    }
}

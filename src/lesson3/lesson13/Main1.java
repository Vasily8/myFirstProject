package lesson3.lesson13;

public class Main1 {
    public static void main(String[] args) {
        Table table1 = new Table(12,4,67);
        Table table2 = new Table(12,4,67);

        Table table3 = table1;

       boolean resultEqual= table1.equals(table2);
       System.out.println(resultEqual);

        System.out.println(table1.equals(table3));

        System.out.println(table1);

    }
}

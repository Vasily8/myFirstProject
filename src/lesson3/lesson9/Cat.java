package lesson3.lesson9;

public class Cat {
    private String poroda;
    private int age;
    private double dlinaHvosta;


    public Cat(){

    }

    public Cat (int newAge, String por, double dh) {
        age = newAge;
        poroda = por;
        dlinaHvosta = dh;


    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getDlinaHvosta() {
        return dlinaHvosta;
    }

    public void setDlinaHvosta(double dlinaHvosta) {
        this.dlinaHvosta = dlinaHvosta;
    }
}





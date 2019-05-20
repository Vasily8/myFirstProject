package lesson3.lesson10;

public class Animal {

    private int age;
    private int name;

    public Animal(){

    }

    public Animal(int age, int name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void printToConsol(){
        System.out.println("Животное с возрастом "+this.getAge());
    }
}

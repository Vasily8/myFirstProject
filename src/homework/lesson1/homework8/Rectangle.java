package homework.lesson1.homework8;

public class Rectangle {
    private int sideOne;
    private int sideTwo;
    private int sideFree;
    int summ;


    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSideFree() {
        return sideFree;
    }

    public void setSideFree(int sideFree) {
        this.sideFree = sideFree;
    }

    public Rectangle(){

    }

    public Rectangle(int sideOne, int sideTwo, int sideFree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideFree = sideFree;
    }

    public void summRectangl (int sideOne, int sideTwo, int sideFree){
        summ = sideOne + sideTwo + sideFree;
        System.out.println(summ);
    }

}

package homework.lesson1.homework8;


public class Crug {
    private int radius1;
    private int radius2;
    int summ3;

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    public Crug (){

    }



    public Crug(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    public void summCircle (int radius1, int radius2){
        summ3 = radius1*radius2;
        System.out.println(summ3);

    }
}

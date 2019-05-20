package lesson3.lesson8;

public class Main4 {
    public static void rashetZarplati (int zarplataVmesyts){
        int vNedelu = 0;
        int vDay = 0;
        if (zarplataVmesyts != 0){
            vNedelu = zarplataVmesyts /4;
            vDay = vNedelu / 5;
            System.out.println("Ваша зарплата в неделю составила " + vNedelu);
            System.out.println("Ваша зарплата в день составила " + vDay);


        }
    }

    public static void rashetZp2(int zpVM2){

        System.out.println("Ваша зарплата в неделю составила " + zpVM2 /4);
        System.out.println("Ваша зарплата в день составила " + zpVM2 /4 / 5);
    }

    }






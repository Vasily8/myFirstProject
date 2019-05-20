package lesson3.lesson6;

public class Student {
    // формула создания метода
    // 1- модификатор доступа public, privet - доступ внутри общего класса, protected - доступ внутри общего класса и наследники. пустое место - доступ в папке.
    // 2 - слово static (статичность) есть, или нет. static - его может вызвать кто угодно.
    // 3 - возвращаемый тип int, Strind, char{} ....) - у  void нет возвращаемого типа.
    // 4 - название нашего метода - придумываем в произвольной форме - только с маленькой буквы.
    // 5 - входящие параметры в скобках через запятую,(тип и названия переменной)
    // 6 - в фигурный скобках - тело метода, то что будет выполняться когда этот метод вызвать.
    public static int summPlus(int a, int b, int c) {
        int summ = a + b + c;
        return summ;
    }

    public static void chetNechet(int chislo){
        if (chislo % 2 == 0){
            System.out.println("Это четное число");
        }
        else {
            System.out.println("Число не четное");
        }

    }
    public static void pramoUgol (int sideOne, int sideTwo) {
        if (sideOne != sideTwo) {
            System.out.println("Площадь треугольника равга "+sideOne*sideTwo);
        }
        else {
            System.out.println("Вы вели неправильные параметры");
        }
    }

   public static void vivodSlovo (int slovo){
        for (int i = 0; i<slovo; i++){
            System.out.println("Privet");
        }
   }

}

package lesson3.lesson9;

public class Phone {
     private double diagonal;
     private String model;
     private int price; // поля класса - переменные объявленые внутри класса которые описывает сотс объекта
// Инкапсуляция -  модификатор доступа это слово которое опред область видимости. Перед Класс, Переменные, Конструктор, Методом

     public void setDiagonal (double newDiagonal){
         diagonal = newDiagonal;
     }
     public double getDiagonal (){
         return diagonal;
     }


     public void setModel(String newModel){
         model = newModel;
     }
     public String getModel(){
         return model;
     }

     public void setPrice(int newPrice){
         price = newPrice;

     }
     public int getPrice (){
         return price;
     }
}

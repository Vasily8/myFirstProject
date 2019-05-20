package homework.lesson1.homework12;

public class MeizuM5 implements Phone,Photoaparat {


    @Override
    public void call() {
        System.out.println("Мы звоним ");
    }

    @Override
    public void sendMassage(String massage) {
        System.out.println("Отпоавляем смс");

    }

    @Override
    public void doFoto() {
        System.out.println("Делаем фото");

    }

    @Override
    public void doVideo() {
        System.out.println("Делаем видео");

    }
}


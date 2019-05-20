package lesson3.lesson12;

public class MeizuM5 implements Phone, Photoparat {
    @Override
    public void call() {
        System.out.println("Meyze осуществляет звонки ....");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Meyze отправляет смс ....");

    }

    @Override
    public void doPhoto() {
        System.out.println("Meyze делает фото ....");
    }

    @Override
    public void doVideo() {
        System.out.println("Meyze делает видео ....");

    }
}

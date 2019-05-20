package homework.lesson1.homework4;

public class Main4 {
    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c', 'd'};
        char [] arr2 = {'q', 'w', 'e', 'r'};
        String text = "Are you ready to start studying of programming?";
        String text1 = text.replace('A', 'a');

        String text2 = text1.replace(arr[0], arr2[0]);
        String text3 = text2.replace(arr[1], arr2[1]);
        String text4 = text3.replace(arr[2], arr2[2]);
        String text5 = text4.replace(arr[3], arr2[3]);


        System.out.println(text5);


    }
}

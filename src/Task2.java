import java.util.Scanner;

public class Task2 {
    //2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        String a = in.next();
        System.out.print("b: ");
        String b = in.next();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");

        }
        in.close();

    }
}

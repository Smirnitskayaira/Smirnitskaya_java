import java.util.Scanner;

public class Task1 {
    /* 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
    - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
    - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.*\

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        in.close();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

    }

}


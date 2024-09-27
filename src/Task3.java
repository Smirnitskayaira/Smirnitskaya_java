

public class Task3 {
    // 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа.

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
    }
}

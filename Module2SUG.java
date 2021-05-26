package by.module2.algorithmization.main;
import java.util.Arrays;
import java.util.Scanner;

public class Module2SUG {
    /*Два простых числа называются "близнецами", если они отличаются друг от друга на 2(например, 41 и 43)
     * Найти и напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное число
     * больше 2. Для решения задачи использовать декомпозицию. */

    public static void main(String[] args) {
        System.out.print("Введите n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //создания массива
        int[] arr = new int[2 * n - n + 1];
        arr = getArray(n);
        System.out.println(Arrays.toString(getArray(n)));
        //вывод пар чисел
        getNum(arr);
    }

    private static int[] getArray(int n) {
        int[] arr = new int[2 * n - n + 1];
        for (int i = 0; i < 2 * n - n + 1; i++) {
            arr[i] = n + i;
        }
        return arr;
    }

    private static void getNum(int[] arr) {
        for(int i=0; i < arr.length-2; i++) {
            System.out.println(arr[i] + " " + arr[i+2]);
        }
    }
}


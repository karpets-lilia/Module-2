package by.module2.algorithmization.main;
import java.util.Scanner;

public class Module2GHS {
    /*Даны натуральные числа N и K. Написать метод(методы) формирования массива А,
    * элементами которого являются числа, сумма цифр которых равна К и которые не больше N. */
    public static int recursionNumber = 0;

    public static void main(String[] args) {
        int k = 10;
        int n = 5;
        System.out.print("Введите размерность массива: ");
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        for(int elem: getArray(arrSize, k, n)) {
            System.out.println(elem);
        }
        System.out.println("рекурсий: " + recursionNumber);
    }

    private static int[] getArray(int arrSize, int k, int n) {
        recursionNumber += 1;
        int[] arr = new int[arrSize];
        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int randomSize;
            if (k-sum < n) {
                randomSize = k - sum;
            } else {
                randomSize = n;
            }
            arr[i] = (int) ( Math.random() * randomSize);
            sum += arr[i];
        }

        if (k - sum < n) {
            arr[arr.length - 1] = k - sum;
        } else {
            arr = getArray(arrSize, k, n);
        }

        return arr;
    }
}

package by.module2.algorithmization.main;

public class Module2POL {
    /*Написать метод(методы)для вычисления суммы факториалов всех нечетных чисел от 1 до 9. */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i=i+2) {
            sum += multiplyTo(i);
        }
        System.out.println(sum);
    }

    private static long multiplyTo(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
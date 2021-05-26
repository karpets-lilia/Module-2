package by.module2.algorithmization.main;

public class Module2LYB {
    /* Из заданного числа вычесть сумму его цифр. Из результата вновь вычесть сумму его цифр и т.д.
     * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
    public static void main(String[] args) {
        int n = 25;
        int k = 0;
        while (n > 0) {
            n = n - getSum(n);
            k++;
        }
        System.out.println(k);
    }

    private static int getSum(int n) {
        String stringNum = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            sum += digit;
        }
        return sum;
    }
}



package by.module2.algorithmization.main;

public class Module2RCK {
    /*Натуральное число, в записи которого n - цифр, называется числом Армстронга, если сумма его цифр,
     * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
     * Для решения задачи использовать декомпозицию.*/
    public static void main(String[] args) {
        int k = 999;
        for (int i = 1; i <= k; i++){
            boolean isArmstrongNumber = checkArmstrongNumber(i);
            if (isArmstrongNumber) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkArmstrongNumber(int num) {
        String stringNum = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            sum += Math.pow(digit, stringNum.length());
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}

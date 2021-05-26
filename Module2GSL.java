package by.module2.algorithmization.main;

public class Module2GSL {
    /* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
     * Определить также, сколько четных цифр в найденной сумме.Для решения задачи использовать декомпозицию.*/
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for (double i = Math.pow(10, n-1); i < Math.pow(10, n); i++) {
            int num = (int)i;
            Boolean oddNum = checkOddNum(num);
            if (oddNum) {
                sum += num;
            }
        }
        System.out.println("сумма n - значных чисел, содержащих только нечетные цифры:" + sum);
        System.out.println("количество чётных элементов в сумме равно:" + getEvenNum(sum));
    }

    private static Boolean checkOddNum(int n) {
        String stringNum = String.valueOf(n);
        for (int i = 0; i < stringNum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            if (digit % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getEvenNum(int num) {
        int evenCount = 0;
        String stringNum = String.valueOf(num);
        for (int i = 0; i < stringNum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            if(digit % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}

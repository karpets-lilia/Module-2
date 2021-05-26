package by.module2.algorithmization.main;

public class Module3SKW {
    /*Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3],
     * D[3] + D[4] + D[5], D[4] + D[5] + D[6].
     * пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
     *  элементов массива с номерами от k до m. */
    public static void main(String[] args) {
        int[] D = {1, 3, 5, 2, 4, 3, 1, 9};
        int sum1 = getSum(D,1);
        int sum2 = getSum(D,3);
        int sum3 = getSum(D,4);
        System.out.println("сумма D[1] + D[2] + D[3] равна: " + sum1 );
        System.out.println("сумма D[3] + D[4] + D[5] равна: " + sum2 );
        System.out.println("сумма D[4] + D[5] + D[6] равна: " + sum3 );
    }

    private static int getSum(int[] D, int k) {
            int sum = D[k] + D[k + 1] + D[k + 2];
            return sum;
        }
    }









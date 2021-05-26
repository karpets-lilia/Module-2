package by.module2.algorithmization.main;

public class Module2E {
    /*задана последовательность N вещественных чиселю Вычислить сумму чисел,
     порядковые номера которых являются простыми числами*/

    public static void main(String[] args) {
        int[] num = {1, 5, 7, 2, 8};
        int sum = 0;
        for (int i = 2; i < num.length; i++) {
            int devidersQuantity = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    devidersQuantity++;
                }
            }
            if (devidersQuantity == 2) {
                sum += num[i];
            }
        }
        System.out.println("сумма " + sum);
    }
}
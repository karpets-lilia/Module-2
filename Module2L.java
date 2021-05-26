package by.module2.algorithmization.main;
public class Module2L {
    /*Задана матрица неотрицательных чисел.
    Посчитать сумму элементов в каждом столбце.
    * Определить какой столбец содержит максимальную сумму.*/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8},
                {4, 5, 6},
                {1, 2},
        };
        int maxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumElements = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumElements += matrix[j][i];
            }
            System.out.println(sumElements);
            if (sumElements >= maxSum) {
                maxSum = sumElements;
            }
        }
        System.out.println(maxSum);
    }
}

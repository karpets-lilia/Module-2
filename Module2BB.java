package by.module2.algorithmization.main;

public class Module2BB {
    /*найдите наибольший элемент матрицы и замените все нечетные элементы на него*/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 4},
                {3, 1, 2},
                {7, 8, 3},
                {5, 2, 9}
        };
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
                System.out.println("Максимальный элемент матрицы " + max);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "  ");
                    }
                    System.out.println("");
        }
    }
}

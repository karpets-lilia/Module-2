package by.module2.algorithmization.main;

public class Module2P {
    /*Отсортировать строки матрицы по возрастанию и убыванию значений элементов*/
    public static void main(String[] args) {
        int [][] matrix = {
                {8,7,1,2},
                {2,1,6,5},
                {3,4,7,2}
        };
        // сортировка матрицы по возрастанию
        System.out.println("сортировка матрицы по возрастанию");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] >= matrix[i][j+1]) {
                    int tempEl = matrix[i][j];
                    matrix[i][j] = matrix[i][j+1];
                    matrix[i][j+1] = tempEl;
                    if (j != 0) {
                        j = j - 2;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        // сортировка матрицы по убыванию
        System.out.println("сортировка матрицы по убыванию");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i][j+1]) {
                    int tempEl = matrix[i][j];
                    matrix[i][j] = matrix[i][j+1];
                    matrix[i][j+1] = tempEl;
                    if (j != 0) {
                        j = j - 2;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
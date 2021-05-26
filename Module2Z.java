package by.module2.algorithmization.main;

public class Module2Z {
    /*Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов*/
    public static void main(String[] args){
        int [][] matrix = {
                {8,7,1,3,4},
                {2,1,6,1,3},
                {3,4,7,2,9}
        };
        int maxLength = matrix[0].length;
        // сортировка матрицы по возрастанию
        System.out.println("сортировка матрицы по возрастанию");
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][i] >= matrix[j+1][i]) {
                    int tempEl = matrix[j][i];
                    matrix[j][i] = matrix[j+1][i];
                    matrix[j+1][i] = tempEl;
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
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][i] <= matrix[j+1][i]) {
                    int tempEl = matrix[j][i];
                    matrix[j][i] = matrix[j+1][i];
                    matrix[j+1][i] = tempEl;
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
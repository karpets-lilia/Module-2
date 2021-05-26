package by.module2.algorithmization.main;

public class Module2W {
    /*Сформировать квадратную матрицу порядка N по правилу
     * A[I,J]=sin((I^2-J^2)/N и подсчитать количество положительных элементов в ней */
    public static void main(String[] args) {
        int N = 3;
        int count = 0;
        double[][] matrix = new double[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.round(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N));
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }System.out.print("количество положительных элементов "+ count);
    }
}

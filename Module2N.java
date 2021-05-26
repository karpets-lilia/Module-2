package by.module2.algorithmization.main;
public class Module2N {
    /*Сформировать квадратную матрицу по заданному образцу{1,1,1...1,1,1},
     * {2,2,2,...,2,2,0},{3,3,3,...,3,0,0},{n-1,n-1,0,...,0,0,0}...{n,0,0,...,0,0,0} (n- четное)*/
    public static void main(String[] args) {
        int n = 8;
        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n - count) {
                        for (; j < n; j++) {
                            matrix[i][j] = 0;
                        }
                    } else
                        matrix[i][j] = i + 1;
                }
                count++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

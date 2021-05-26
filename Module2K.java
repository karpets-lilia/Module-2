package by.module2.algorithmization.main;

public class Module2K {
    /*Сформировать квадратную матрицу по заданному образцу{1,2,3...n},
     * {n,n-1,n-2,1},{1,2,3...n},{n,n-1,n-2,1}...{n,n-1,n-2,1} (n- четное)*/
    public static void main(String[] args) {
        int n =4;
        if(n%2 == 0){
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    for(int j = 1; j <= n; j++){
                        matrix[i][j-1] = j;
                    }
                } else {
                    for(int j = n; j > 0; j--){
                        matrix[i][n-j] = j;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println("");
            }
        }
    }
}

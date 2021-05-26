package by.module2.algorithmization.main;

public class Module2X {
    /*Сформировать квадратную матрицу по заданному образцу{1,1,1...1,1,1},
     * {0,1,1,...,1,1,0},{0,0,1,...,1,0,0},{0,1,1,...,1,1,0}...{1,1,1,...,1,1,1} (n- четное)*/
    public static void main(String[] args) {
        int n =8;
        if(n%2 == 0){
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i > j) && (i+j < n-1) || (i < j) && (i+j > n-1)){
                        matrix[i][j] = 0;
                    }else{
                        matrix[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}

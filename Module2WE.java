package by.module2.algorithmization.main;

public class Module2WE {
    /*Магическим квадратом порядка n называется квадратная матрица размера n на n,
     * составленная из чисел 1,2,3,...,n^2 так, что суммыо каждому столбцу, каждой строке
     * и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. */
    public static void main(String[] args) {
        int n = 3;
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        System.out.println("магический квадрат");
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
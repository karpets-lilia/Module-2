package by.module2.algorithmization.main;
import java.util.Scanner;

public class Module2Y {
    /*В числовой матрице поменять местами два любых столбца,т.е.
     * все элементы одного столбца поставить на соответствующие им позиции другого,
     * а его элементы второго переместить в первый.
     * Номера столбцов пользователь вводит из клавиатуры*/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {3, 6, 8},
                {1, 2, 8},
                {9, 1, 2},
        };
        int column = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите номер первого столбца: ");
        int firstColumn = scanner.nextInt();
        System.out.println("введите номер второго столбца: ");
        int secondColumn = scanner.nextInt();
        if(firstColumn <= matrix.length && secondColumn<= matrix.length ) {
            for (int i = 0; i < matrix.length; i++) {
                column = matrix[i][firstColumn];
                matrix[i][firstColumn] = matrix[i][secondColumn];
                matrix[i][secondColumn] = column;
            }
        } else{
            System.out.println("введен номер столбца не входящий в область матрицы ");
                }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
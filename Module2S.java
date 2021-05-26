package by.module2.algorithmization.main;

public class Module2S {
    /* Найти положительные элементы главной диагоали квадратной матрицы*/
    public static void main(String [] args){
        int diagCounter = 0;
        int matrix[][] = {
                {52, 57, 27},
                {37, -17, 16},
                {26, 45, 31}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] >= 0 ) {
                    System.out.println("положительные элементы проходящие по главной диагонали" +matrix[i][j]);
                }
            }
        }
    }
}



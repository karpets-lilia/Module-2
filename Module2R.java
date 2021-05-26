package by.module2.algorithmization.main;

public class Module2R {
    /* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
    public static void main(String[] args) {
        int diagCounter = 0;
        int matrix[][] = {
                {52, 57, 27},
                {37, 17, 16},
                {26, 45, 31}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.println("элементы проходящие по первой диагонали" +matrix[i][j]);
                }
                if (i+j == matrix.length-1){
                    System.out.println("элементы проходящие по второй диагонали" + matrix[i][j]);
                }
            }
        }
    }
}








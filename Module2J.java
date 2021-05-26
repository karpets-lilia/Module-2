package by.module2.algorithmization.main;

import java.util.Scanner;
public class Module2J {
    /* Дана матрица. Вывести k-ю строку и p-ый столбец*/
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 2, 1},
                {3, 7, 3}
        };
        int k = 2;
        int p = 1;
        if (k < matrixA.length && p < matrixA.length) {
            for (int i = 0; i < matrixA.length; i++) {
                System.out.print(matrixA[k][i]);
            }
            System.out.println("");
            for (int i = 0; i < matrixA.length; i++) {
                System.out.print(matrixA[i][p]);
            }
        }
    }
}



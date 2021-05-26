package by.module2.algorithmization.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Module2U {
    /*Сформировать случайную матрицу m на n, состоящую из нулей и единиц,
     * причем в каждом столбце число единиц равно номеру столбца.  */
        public static void main(String[] args) {
            int m = 7;
            int n = 3;
            int[][] matrix = new int[m][n];
            if (m < n) {
                System.out.println("Не корректные данные.\n Не соответствует условию задачи");
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j >= i){
                        matrix[i][j] = 1;
                    }
                    else matrix[i][j] = 0;
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arrayList.add(matrix[j][i]);
                }
                Collections.shuffle(arrayList);
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = arrayList.get(j);
                }
                arrayList.clear();
            }
            System.out.println();
            for (int[] each : matrix) {
                System.out.println(Arrays.toString(each));
        }
    }
}

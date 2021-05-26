package by.module2.algorithmization.main;
import java.util.Random;

public class Module2Q {
    /*Матрицу 10 на 20 заполнить случайными числами от 0 до 15.
     * Вывести на экран саму матрицу и номера строк, в которых
     * число 5 встречается 3 или более раз.*/
    public static void main(String[] args) {
        Random rnd = new Random();
        int matrix[][] = new int[10][20];
        int count = 0;
        String s = "Больше трех раз 5 повторяется в строках:";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + "\t");
                if (matrix[i][j] == 5){
                    count ++;
                }
            }
            System.out.println();
            if (count >= 3){
                s = s + i + "\t";
            }
        }
        System.out.println(s);
    }
}

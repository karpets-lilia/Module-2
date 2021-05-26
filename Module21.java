package by.module2.algorithmization.main;
import java.util.Random;

public class Module21 {
    /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
кратны данному К*/

    public static void main(String args[]){
        int[] arr = generateArray(200);
        double k = 2, sum = 0.0;
        for (double a: arr) {
            System.out.println("остаток от деления " + a + " на 2 = " + a % k);
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    private static int[] generateArray(int num) {
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i=0; i<num; i++) {
            arr[i]=(int)(rand.nextDouble()*100);
        }
        return arr;
        }
    }


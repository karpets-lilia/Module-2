package by.module2.algorithmization.main;

public class Module22 {
    /* Дана последовательность действительных чисел а1, а2,..., аn.
     Заменить все ее члены, большие данного Z, этим числом. Подсчитать
     количество замен.*/
    public static void main(String[] args) {
        int[] number = {2, 4, 5, 32, 86, 11, 15, 100};
        int z = 20;
        int k = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > z){
                number[i] = z;
                k++;
            }
            System.out.println(number[i]);

        }
        System.out.println("Колличество замен" + k);
    }
}


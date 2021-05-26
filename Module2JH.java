package by.module2.algorithmization.main;

import java.util.Arrays;

public class Module2JH {
    /*Сортировка обменами. Дана последовательность чисел a1 <= a2 <=... <= an. Требуется
      переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
       ai и a(i+1).Если  ai > a(i+1), то делается перестановка. Так продолжается до тех
        пор пока все элементы не станут расположены в порядке возрастания.
        Составить алгоритм сортировки, подсчитывая при этом количества перестановок*/
    public static void main(String[] args){
    int[] arr = {2, 4, 7, 20, 27};
    int count = 0;
    boolean isSorted = false;
    int buf;
        while(!isSorted){
        isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                buf = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = buf;
                count++;
            }

        }
    }
        System.out.println("количество перестановок: " + count);
        System.out.println(Arrays.toString(arr));
    }
}



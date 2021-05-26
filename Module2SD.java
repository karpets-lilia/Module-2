package by.module2.algorithmization.main;

import java.util.Arrays;

public class Module2SD {
    /*Сортировка Шелла. Дан массив n действительных чисел.
     Требуется упорядочить его по возрастанию.
    * Делается это следующим образом: сравниваются два соседних элемента ai  и a(i+1).
    * Если ai <= a(i+1). То продвигаются на один элемент вперед. Если ai > a(i+1),
     то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки. */
    public static void main(String[] args){
        int [] array = {2,-5,10,8,-11,15};
            int h = 0;
            int n = array.length;
            int temp;
            while (h < n / 3)
                h = 3 * h + 1;


        for(int k = h; k > 0; k = (k-1)/3)
            for(int i = k; i < array.length; i++)
            {
                temp = array[i];
                int j;
                for(j = i; j >= k; j -= k)
                {
                    if(temp < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
        System.out.println("массив порядке возрастания: ");
        System.out.println(Arrays.toString(array));
    }
}


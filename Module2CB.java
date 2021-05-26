package by.module2.algorithmization.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Module2CB {
    /*даны две последовательности a1 <= a2 <=... <= an и b1 <= b2 <=... <=bm.
    * Образовать из них новую последовательность чисел так,
    * чтобы она тоже была неубывающей. Примечание.Дополнительный массив не использовать.*/
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(1, 2, 3, 10));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(5, 6, 8, 12, 24));
        System.out.println(arr1);
        arr1.addAll(arr2);
        System.out.println(arr1);
        Integer[] arr1Array = arr1.toArray(new Integer[arr1.size()]);
        System.out.println("Обьединенные последовательности: " + Arrays.toString(arr1Array));
            Arrays.sort(arr1Array);
            System.out.println("Новая последовательность чисел");
            System.out.println(Arrays.toString(arr1Array));
        }
    }


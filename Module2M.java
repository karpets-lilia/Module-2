package by.module2.algorithmization.main;
import java.util.Arrays;

public class Module2M {
    /*Дан целочисленный массив с количеством элементов n.
    Сжать массив выбросив из него каждый второй элемент,
    освободившиеся элементы заполнить нулями. примечание(дополнительный массив не использовать)*/
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6, 7, 8};
        int stepSize = 1;
        for (int i = 1; i < arr.length; i++) {
            if(i+stepSize<arr.length) {
                arr[i] = arr[i + stepSize];
                stepSize++;
            }else{
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



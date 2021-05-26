package by.module2.algorithmization.main;

import java.util.Arrays;
public class Module2C {
    /*Даны действительные числа a1, a2,..., an . Поменять местами
     * наибольший и наименьший элементы*/
    public static void main(String [] args){

    int[] arr = {1,5,2,9,4,7};

    int maxElement= arr[0];;
    int minElement = arr[0];
    int maxPosition = 0;
    int minPosition = 0;

    for(int i = 0; i< arr.length; i++){
        if(arr[i]>=maxElement){
            maxElement = arr[i];
            maxPosition = i;
        }
        if(arr[i]<= minElement){
            minElement = arr[i];
            minPosition = i;
        }
    }
    arr[maxPosition] = minElement;
    arr[minPosition] = maxElement;

        System.out.println(Arrays.toString(arr));
    }
}


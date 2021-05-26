package by.module2.algorithmization.main;

public class Module2D {
    /* даны целые числа а1, а2,...,an.вывсти на печать только те числа, для которых ai>i*/

    public static void main(String [] args){
        int [] arr = {1,4,5,7,3,9,2};
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>i){
                System.out.println(arr[i]);

            }

        }

    }
}

package by.module2.algorithmization.main;

public class Module2B {
    /* Дан массив действительных чисел,  размерность которых N.
     Подсчитать, сколько в нем отрицательных , положительных
     и нулевых элементов*/
    public static void main(String args[]){
        int arr[] = {1, 3, 100, 32, -22, 0, -2, 54};
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i =0; i < arr.length; i++) {
            if (arr[i] < 0) {
                a++;

            }else if(arr[i] > 0){
                b++;
            }else if(arr[i] == 0){
                c++;
            }


        }
        System.out.println("колличество отрицательных элементов" + a);
        System.out.println("колличество положительных элементов" + b);
        System.out.println("колличество нулевых элементов" + c);
    }
}

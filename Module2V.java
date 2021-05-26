package by.module2.algorithmization.main;

public class Module2V {
    /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
кратны данному К*/

    public static void main(String args[]){
        int[] mas = {20,45,7,9,43,70};
        int divider = 5;
        int sum = 0;
        for(int element : mas){
            if(element % divider == 0){
                sum = sum + element;
            }
        }
        System.out.println(sum);

    }
}

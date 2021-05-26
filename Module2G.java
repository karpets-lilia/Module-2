package by.module2.algorithmization.main;

public class Module2G {
    /*дана последовательность целых чисел a1,a2,....an.
    * Образовать новую последовательность, выбросив из исходной
    * те члены которые  равны min(a1, a2,...an)*/
    public static void main(String [] args){
        int [] mas = {1,3,5,6,7,0,9,4};
        int minCount = 0;
        int min = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= min) {
                min = mas[i];
            }
        }
        for (int value : mas) {
            if (value == min) {
                minCount++;
                System.out.println(minCount);
            }
        }
        int[] result = new int[mas.length - minCount];
        int indexResult = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != min) {
                result[indexResult] = mas[i];
                indexResult++;
            }
        }
    System.out.println(indexResult);
    }
}

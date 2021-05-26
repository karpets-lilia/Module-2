package by.module2.algorithmization.main;

public class Module2H {
    /* В массиве целых чисел с количеством элементов n найти
    наиболее часто встречающееся число. Если таких чисел несколько,
    то определить наименьшее из них */
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,2,1,1,2};
        int maxCount = 0;
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxNumber = arr[i];
            }else if(count == maxCount){
                if(arr[i] < maxNumber){
                    maxNumber = arr[i];
                }
            }
        }
        System.out.println("наиболее часто встречающееся число " + maxNumber);
        System.out.println("количество повторений " + maxCount);
    }
}


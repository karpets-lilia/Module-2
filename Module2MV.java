package by.module2.algorithmization.main;

public class Module2MV {
    /*Сортировка выбором. Дана последовательность чисел a1 <= a2 <=... <= an. Требуется переставить элементы так,
     * чтобы они были расположены по убыванию. Для этого в массиве , начиная с первого, выбирается
     * наибольший элемент и ставится на первое место, а первый на место наибольшего.
     * Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором. */
    public static void main(String[] args) {
        int[] array = {3, 1, 6, 7, 2, 9, 5, 4};
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;    // pos - индекс наибольшего элемента
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;    // меняем местами наибольший с array[i]
            System.out.print(" " + array[i]);
        }
    }
}



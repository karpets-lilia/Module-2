package by.module2.algorithmization.main;
import java.util.Arrays;
public class Module2KL {
    /*Сортировка вставками. Дана последовательность чисел a1,a2,...,an.
    * Требуется перествить числа впорядке возрастания. Делается это следующим образом.
    * Пусть a1,a2,...,an - это упорядоченная последовательность, т.е a1 <= a2 <= ...<= an.
    * Берется следующее число a(i+1) и вствляетя в последовательность так,
    * чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор ,
    * пока все элементы от i+1 до n не будут перебраны.Примечание. Место помещения очередного элемента
    * в отсортировнную часть производить с помощью двоичного поиска.
    *  Двоичный поиск оформить в виде отдельной функции. */
    public static void main(String[] args){
        int[] array = {8, 2, 1, 3, 5, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println("В порядке возрастания: ");
        System.out.println(Arrays.toString(array));
    }
}

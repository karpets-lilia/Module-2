package by.module2.algorithmization.main;
import java.util.ArrayList;
import java.util.List;

public class Module2VN {
    /*Заданы 2 одномерных массива с различным количеством элементов и натуральное число k.
     * Обьединить их в один массив, включив второй массив между k-м и (k+1) - м элементами
     * первого, при этом не используя дополнительный массив. */
    public static void main(String[] args) {
        int k = 1;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(1, 2, 4));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(3, 5, 7, 9));
        System.out.println(arr1);
        arr1.addAll(k, arr2);
        System.out.println("Второе добавление в середину: " + arr1);
    }
}
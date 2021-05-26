package by.module2.algorithmization.main;


public class module23 {
    /*Составить программу, которая в массивеA[N] находит второе по величине число
     * (вывести на печать число , которое меньше максимального элемента массива,
     * но больше всех других элементов. */

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 10, 2, 8, 11};
        int elem = getSecondMaxElement(a);

        System.out.println("Второй по величине элемент, " +
                "который меньше максимального элемента массива," +
                "но больше всех других элементов: " + elem);
    }

    private static int getSecondMaxElement(int[] a) {
        int max2 = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] < a[j]) {
                    int tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                    max2 = a[1];
                }
            }
        }
        return a[1];
    }
}



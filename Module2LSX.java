package by.module2.algorithmization.main;


import java.util.Arrays;

public class Module2LSX {
    /*Дано натуральное число N. Написать метод(методы) для формирования массива,
    элементами которого являются цифры числа N*/
    public static void main(String[] args) {
        for (int k : getArray(12345)) {
            System.out.print(k + " ");
        }
    }

    private static int[] getArray(int a) {
        String str = Integer.toString(a);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return arr;
    }
}



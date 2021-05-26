package by.module2.algorithmization.main;

public class Module2FD {
    /* Пусть даны две неубывающие последовательности действительных чисел
     * a1<=a2<=...<=an и b1<=b2<=...<=bm. Требуется указать те места , на которые нужно вставлять
     * элементы последовательности b1<=b2<=...<=bm в первую последовательность так, чтобы новая
     * последовательность оказалась возрастающей.*/
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {-1, 3, 4, 7};
        for (int i = 0; i < arr2.length; i++) {
            boolean position = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] < arr1[j]) {
                    System.out.printf("%d елемент второго масс. вставим до %d элем. первого\n", i, j);
                    position = false;
                    break;
                }
            }
            if (position)
                System.out.printf("%d елемент первого масс. вставим после последенго элем. второго\n", i);
        }
    }
}
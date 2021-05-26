package by.module2.algorithmization.main;

public class Module2F {
    /* даны действительные числа a1, a2, ...,an.
    Найти max(a1 + a2n, a2 + a2n-1,...,an+an+1). */
    public static void main(String[] args) {
        int[] num = {1, 5, 2, 4, 8};
        int maxSum = num[0] + num[num.length - 1];
        for (int i = 1; i < num.length / 2; i++) {
            if ((num[i] + num[num.length - i - 1]) > maxSum) {
                maxSum = num[i] + num[num.length - i - 1];
            }

        }
        System.out.println(maxSum) ;
    }

}

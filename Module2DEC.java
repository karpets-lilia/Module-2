package by.module2.algorithmization.main;

public class Module2DEC {
    /*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
     * (например , 1234, 5789).Для решения задачи использовать декомпозицию.*/
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i < 11 - n; i++) {
            int num = getAscendingNum(n, i);
            System.out.println(num);
        }
    }

    private static int getAscendingNum(int n, int i) {
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum += Math.pow(10, n-k-1) * (i+k);
        }
        return sum;
    }
}

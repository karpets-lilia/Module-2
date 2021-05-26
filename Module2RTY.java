package by.module2.algorithmization.main;

public class Module2RTY {
    /*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел*/
    public static void main(String[] args) {

        int[] arr = {15,10,30,45};
        int nod = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nod = algorithmEvklid(nod, arr[i]);
        }
        System.out.println("Наибольший общий делитель:" + nod);
    }

    public static int algorithmEvklid(int a, int b) {
        int k = 0;
        while (b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            k = a + b;
        }
        return k;
    }
}

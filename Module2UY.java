package by.module2.algorithmization.main;

public class Module2UY {
    /*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
     * двух натуральных чисел НОК(А,В)= А*В/НОД(А,В)*/
    public static void main(String[] args) {

        System.out.println("Наибольший общий делитель:" + algorithmEvklid(15, 6));
        System.out.println("Наименьшеее общее кратное:" + nok(15,6));
    }

    public static int algorithmEvklid(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }

    public static int nok(int a, int b) {
        int nok = (a * b) / algorithmEvklid(15, 6);
        return nok;
    }
}

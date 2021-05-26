package by.module2.algorithmization.main;

public class module2JKS {
    /*Написать метод(методы),проверяющий, являются ли  данные три числа взаимно простыми*/
    public static void main(String[] args) {
        int[] arr = {30, 11, 24};
        int nod = getNod(getNod(arr[0], arr[1]), arr[2]);
        if (nod == 1) {
            System.out.println("простые");
        } else {
            System.out.println("сложные, общий делитель: " + nod);
        }
    }

    private static int getNod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else if (b > a){
                b %= a;
            }
        }
        return a + b;
    }
}

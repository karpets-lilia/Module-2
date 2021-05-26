package by.module2.algorithmization.main;

public class Module2POU {
    /* написать метод(методы), определяющий ,в каком из данных двух чисел больше цифр*/
    public static void main(String[] args) {
        int numOne = getNumOne(124);
        int getNumTwo = getNumOne(1263);
        if (numOne > getNumTwo){
            System.out.println("в первом числе больше цифр.");
        } else if(numOne < getNumTwo) {
            System.out.println("во втором числе больше цифр.");
        } else if(numOne == getNumTwo) {
            System.out.println("количество цифр в обоих числах одинаково.");
        }
    }

    public static int getNumOne(long a) {
        return String.valueOf(Math.abs(a)).length();
    }
}


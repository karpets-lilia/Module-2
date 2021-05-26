package by.module2.algorithmization.main;

import java.util.Arrays;

public class Module2SX {
    /* Даны дроби p1/q1,p2/q2,...,pn/qn (pi,qi - натуральные). Составить программу,
     которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания*/
    public static void main(String [] args){
        String[] fractions = {"3/4", "1/2", "2/3"};
        int[] numenators = new int[fractions.length];
        int[] denominators = new int[fractions.length];
        int commonDenominator = 1;
        // заполняем массивы числителей и знаменателей
        for (int i = 0; i < fractions.length; i++) {
            numenators[i] = Integer.parseInt(fractions[i].substring(0, fractions[i].indexOf("/")));;
            denominators[i] = Integer.parseInt(fractions[i].substring(fractions[i].indexOf("/") + 1, fractions.length));;
        }
        // находим общий знаменатель
        for (int denominator : denominators) {
            commonDenominator *= denominator;
        }
        // приводим к общему знаменателю
        for (int i = 0; i < fractions.length; i++) {
            numenators[i] = numenators[i] * commonDenominator/denominators[i];
            denominators[i] = commonDenominator;
        }
        // сортируем числители по возрастанию
        for (int i = 0; i < numenators.length - 1; i++) {
            if (numenators[i] > numenators[i+1]) {
                int tempNum = numenators[i];
                numenators[i] = numenators[i+1];
                numenators[i+1] = tempNum;
                if (i != 0) {
                    i = i - 2;
                }
            }
        }
        // заполнение первоначального массива значениями по возрастанию
        for (int i = 0; i < fractions.length; i++) {
            fractions[i] = numenators[i] + "/" + commonDenominator;
        }

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i] + "  ");
        }
    }
}

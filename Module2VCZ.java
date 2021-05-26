package by.module2.algorithmization.main;

public class Module2VCZ {
    /*Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади
    * треугольника*/
    public static void main(String[] args){
        System.out.println("Площадь правильного шестиугольника равна :" + (hexagon(2)));
    }

    public static double hexagon(int a){
        double S;
        S = (3 * Math.sqrt(3 * Math.pow(a,2)))/2;
        return S;
    }
}

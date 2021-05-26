package by.module2.algorithmization.main;

public class Module2MSF {
    /* Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать метод (методв) вычисления
    * его площади, если угол между сторонами длиной X  и Y - прямой. */
    public static void main(String[] args) {
        double S = getSquare(3,4,3,3);
        if (S > 0) {
            System.out.println("Площадь четырехугольника равна: " + S);
        } else {
            System.out.println("Невозможно построить четырёхугольник с заданными сторонами");
        }
    }

    private static double getSquare(double x, double y, double z, double t) {
        //так как угод между X и Y - прямой, находим гипотенузу по теореме Пифагора
        double d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (t + z <= d) {
            return 0;
        }
        //Находим площадь прямоугольного треугольника
        double S1 = (x * y)/2;
        //Площадь второго треугольника находим по формуле Герона через полупериметр
        double p = (t + z + d)/2;
        double S2 = Math.sqrt(p * (p - t)*(p - z)*(p - d));
        //Площадь четырехугольника равна сумме площадей состовляющих его треугольников
        double S = S1 + S2;
        return S;
    }
}




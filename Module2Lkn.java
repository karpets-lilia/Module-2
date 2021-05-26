package by.module2.algorithmization.main;

public class Module2Lkn {
    /*На плоскости заданы своими координатами n точек. Написать метод(методы) , определяющие,
     * между какими из пар точек самое большое расстояние. Указание (координаты точек занести в массив)*/
    public static void main(String[] args) {
        double[][] points = {
                {2,5},
                {6,-1},
                {5,4},
                {1,-3}
        };
        double[] firstPoint = new double[]{};
        double[] secondPoint = new double[]{};
        double maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistanceBetweenPoints(points[i], points[j]);
                if (maxDistance < distance) {
                    maxDistance = distance;
                    firstPoint = points[i];
                    secondPoint = points[j];
                }
            }
        }
        System.out.println("координаты первой точки: " + firstPoint[0] + "," + firstPoint[1]);
        System.out.println("координаты второй точки: " + secondPoint[0] + "," + secondPoint[1]);
        System.out.println("Максимальное расстояние между точками:" + maxDistance);
    }

    private static double getDistanceBetweenPoints(double[] a, double[] b) {
        double d = Math.sqrt(Math.pow(b[0]- a[0], 2) + Math.pow(b[1]-a[1], 2));
        return d;

    }
}


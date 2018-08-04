package ex26;

public class Kata {

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        double A = (double) numberOfSides * circleRadius * circleRadius * Math.sin(Math.toRadians(360 / (double) numberOfSides)) / 2;
        return Double.valueOf(String.format("%.3f", A));
    }

}
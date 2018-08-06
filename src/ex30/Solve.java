package ex30;

public class Solve {
    public static double solve(double m) {
        final int LIMIT_FOR_HIGHER_INPUT = 25000;
        final int LIMIT_FOR_LOWER_INPUT = 250;

        if (m > 264344) return getXForBig(m, 1e-7, LIMIT_FOR_HIGHER_INPUT, 0.999, -0.001);
        if (m > 9800) return getXForBig(m, 1e-7, LIMIT_FOR_HIGHER_INPUT, 0.99, -0.01);
        if (m > 90) return getXForBig(m, 1e-7, LIMIT_FOR_HIGHER_INPUT, 0.9, -0.1);
        else return getXForSmall(m, 1e-11, LIMIT_FOR_LOWER_INPUT, 0.1, 0.1);
    }

    private static double getXForSmall(double m, double epsilon, int limit, double start, double add) {
        double output = 1;
        double h = start;
        while (Math.abs(output - m) >= epsilon) {
            output = 0;
            for (int i = 1; i < limit; i++) {
                output += i * Math.pow(h, i);
            }
            if (Math.abs(output - m) <= epsilon) return h;

            if (m > output) h = h + add;
            if (m < output) {
                h = h - add;
                add = add / 10;
            }
        }
        return h;
    }

    private static double getXForBig(double m, double epsilon, int limit, double start, double add) {
        double output = 1;
        double h = start;
        double temp = 1;
        while (Math.abs(output - m) >= epsilon) {
            output = 0;
            for (int i = 1; i < limit; i++) {
                temp *= h;
                output += i * temp;
            }
            if (m < output) h = h + add;
            if (m > output) {
                h = h - add;
                add = add / 10;
            }
        }
        return h;
    }

}
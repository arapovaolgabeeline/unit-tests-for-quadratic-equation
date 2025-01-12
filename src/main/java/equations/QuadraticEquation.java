package equations;

public class QuadraticEquation {

    private static double e = 0.0000001;

    public static double[] solve(double a, double b, double c) {
        if (Math.abs(a) < Math.abs(e)) {
            throw new IllegalArgumentException();
        }
        double D = b * b - 4 * a * c;
        if (D < -e) {
            return new double[]{};
        } else if (Math.abs(D) <= e) {
            return new double[]{-b/(2*a)};
        } else if (D > e) {
            return new double[]{(-b+Math.sqrt(D))/(2*a), (-b-Math.sqrt(D))/(2*a)};
        } else {
            return new double[]{};
        }
    }

}

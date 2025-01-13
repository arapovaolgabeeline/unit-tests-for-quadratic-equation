package equations;

public class QuadraticEquation {
    public static double e = 0.001;

    public static double[] solve(Double a, Double b, Double c) {
        if (a == null || b == null || c == null || Math.abs(a) < Math.abs(e)) {
            throw new IllegalArgumentException();
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < -e) {
            return new double[]{};
        } else if (Math.abs(discriminant) <= e) {
            return new double[]{-b / (2 * a)};
        } else if (discriminant > e) {
            return new double[]{(-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a)};
        } else {
            return new double[]{};
        }
    }

}

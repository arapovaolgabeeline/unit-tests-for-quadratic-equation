package equations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a, b and c - each one should be start with new line");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double[] solved = QuadraticEquation.solve(a, b, c);

        System.out.println("Result is: " + solved[0] + " and " + solved[1]);
    }
}

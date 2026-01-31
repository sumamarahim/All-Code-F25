// Sumama Rahim - F24BSCS039
// 01/06/2026

import java.util.Scanner;

public class Task3 {

    // --- 1. Recursive Power Function ---
    // Calculates: base^exp
    public double power(double base, int exp) {
        // Base Case: Any number to the power of 0 is 1
        if (exp == 0) {
            return 1;
        }
        // Recursive Step: base * base^(exp-1)
        return base * power(base, exp - 1);
    }

    // --- 2. Recursive Multiplication Function ---
    // Calculates: a * b using repeated addition
    public int multiply(int a, int b) {
        // Base Case: Anything multiplied by 0 is 0
        if (a == 0 || b == 0) {
            return 0;
        }

        // Recursive Step (Positive b): a + (a * (b-1))
        if (b > 0) {
            return a + multiply(a, b - 1);
        }

        // Recursive Step (Negative b):
        // Logic: a * (-b) is the negative of a * b
        // We make b positive and negate the result
        return -multiply(a, -b);
    }

    public static void main(String[] args) {
        Task3 call = new Task3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Recursive Power Calculation ---");
        System.out.print("Enter Base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter Exponent: ");
        int exp = scanner.nextInt();
        System.out.println("Result: " + call.power(base, exp));

        System.out.println("\n--- Recursive Multiplication ---");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Result: " + call.multiply(num1, num2));

        scanner.close();
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class FactorialIterativeWhileLoop {
    public static void main(String args[]) {
        int number;
        System.out.println("Enter an integer to calculate it's factorial (achtung: negative numbers will be converted to positive numbers))");
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
            System.out.println("Your factorial from number: " + number + " is: " + whileFactorial(number));
        } catch (InputMismatchException e) {
            System.out.println("Only integers, please");
        }
    }


    public static int whileFactorial(int n) {
        n = Math.abs(n);
        int i = 1;
        int factorial = 1;
        try {
            while (i <= n) {
                factorial *= i;
                i++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Only integers, please");
        }
        return factorial;
    }
}



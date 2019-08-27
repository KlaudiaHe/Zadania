
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class FactorialIterative {
    public static void main(String args[]) {
        int number;
        System.out.println("Enter an integer to calculate it's factorial (negative numbers will be converted to positive numbers))");
        Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                System.out.println("Your factorial from number: " + number + " is: " + IterativeFactorial(number));
            } catch (InputMismatchException e) {
                System.out.println("Only integers, please");
            }
     }


    public static int IterativeFactorial(int number) {
        int i, factorial =1;
        try{
        number= Math.abs(number);
        for (i = 1; i <= number; i++) {
            factorial *=i;
        }} catch (InputMismatchException e) {
            System.out.println("Only integers, please");
        }
        return factorial;
    }

}


import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        System.out.print("Please type first number: ");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        System.out.print("Please type second number: ");
        int secondNumber = scanner.nextInt();
        int sum=firstNumber+secondNumber;

        System.out.println("sum of numbers is "+ sum);
    }
}
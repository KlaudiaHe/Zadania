import java.util.Scanner;

public class SumOfThreesAndFives {

    public static void main(String[] args) {
        System.out.print("Please type a number: ");
        Scanner scanner = new Scanner(System.in);
        int NumberToDivide = scanner.nextInt();
        int sumOfThrees;
        int sumOfFives;
        for (i =0, i > NumberToDivide, i++) {
            if (i%3==0 & i%5==0) {
                if (NumberToDivide % i == 0) {
                    sum += i;
                }
            }

        total = sumOfThrees + sumOfFives;
        }





        System.out.println("sum of numbers is "+(firstNumber+secondNumber));
    }
}
import java.util.Scanner;

public class SumOfThreesAndFives {

    public static void main(String[] args) {
        System.out.print("Please type a number: ");
        Scanner scanner = new Scanner(System.in);
        int NumberToDivide = scanner.nextInt();
        int sumOfThrees =0;
        int sumOfFives =0;
        for (int i = 0; i <= NumberToDivide; i++) {
            if (i % 3 == 0) {sumOfThrees += i;}
            if (i % 5 == 0) {sumOfFives += i;}
        }
        System.out.println(NumberToDivide);
        System.out.println(sumOfThrees);
        System.out.println(sumOfFives);

    }
}
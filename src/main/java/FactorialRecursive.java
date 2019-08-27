import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();
            System.out.println("Recursive factorial of number " + number + " is: " + recursiveFactorial(number));
        } catch (InputMismatchException e) {
            System.out.println("Integers only, please");
        }
    }

        public static int recursiveFactorial (int number) {
        number= Math.abs(number);
        int factorial =1;
           try{
            if(number == 0){
                return factorial;
            }
            factorial= number * recursiveFactorial((number-1));
        } catch (IllegalArgumentException e) {
               System.out.println("only integers, please");
           }
            return factorial;
        }
}
/*
class Test
{
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args)
    {
        int num = 7;
        System.out.println("Factorial of "+ num + " is " + factorial(7));
    }
}
 */
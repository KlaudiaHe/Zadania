import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner input = new Scanner(System.in);
       int number = input.nextInt();
        System.out.println("Recursive factorial of number "+number+" is: "+recursiveFactorial(number));
    }


        public static int recursiveFactorial (int number) {
            if(number == 1){
                return 1;
            }
            return number * recursiveFactorial((number-1));
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
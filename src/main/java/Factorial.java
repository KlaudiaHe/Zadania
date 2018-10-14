import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int number, i, factorial = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number < 0)
            System.out.println("Number should be non-negative.");
        else
        {
            for (i = 1; i <= number; i++)
                factorial = factorial*i;

            System.out.println("Factorial of "+number+" is = "+factorial);
        }
    }
}

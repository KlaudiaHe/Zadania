import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Please type a number: ");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        long factorial;
        factorial = 1;
        while(int i <= Number)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", Number, factorial);
    }
}



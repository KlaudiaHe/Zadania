import java.util.Scanner;

public class FibonacciIterative {

    public static void main(String[] args) {
    /*  Każdy element jest sumą 2 poprzednich, yyyy
         0 + 1 -> 1
         1 + 1 -> 2
         1 + 2 -> 3 - pierwszy staje się dotychczasowym drugim, a drugi sumą swojego minionego już ja i dawnego firsta
         2 + 3 -> 4
    */

        System.out.println("How many numbers from Fibonacci series do you want to get?");
        Scanner numberOfFibonacciNumbers = new Scanner(System.in);
        double number = numberOfFibonacciNumbers.nextInt();
            //czy na pewno number-2;
        double first = 0;
        double second = 1;
        double sum;
        System.out.println("1 Fibonacci number of value: "+first);
        System.out.println("2 Fibonacci number of value: "+second);
            for (double i = first; i < (number-2); i++) {
            double goldenProportion;
            sum= first + second;
            System.out.println((int)(i+3) +" Fibonacci number of value: "+sum);
            first=second;
            second= sum;
            goldenProportion=second/first;
            System.out.println(goldenProportion);
            }


        //Częstokroć każą sout first i second, i iterować oddzielnie od 2. Ifelse;
    }
}
import java.util.Scanner;
import java.math.*;

public class FibonacciUsingBigInteger {


        public static void main(String[] args) {
    /*  Każdy jest sumą 2 poprzednich, yyyy
         0 + 1 -> 1
         1 + 1 -> 2
         1 + 2 -> 3 - pierwszy staje się dotychczasowym drugim, a drugi sumą swojego minionego już ja i dawnego firsta
         2 + 3 -> 4
    */

            System.out.println("How many numbers from Fibonacci series do you want to get?");
            Scanner numberOfFibonacciNumbers = new Scanner(System.in);
            double number = numberOfFibonacciNumbers.nextInt();
            //czy na pewno number-2;
            BigInteger first = BigInteger.valueOf(0);
            BigInteger second = BigInteger.valueOf(1);
            BigInteger sum = BigInteger.valueOf(1);
            System.out.println("1 Fibonacci number with value: "+first);
            System.out.println("2 Fibonacci number with value: "+second);
            for (int i = first.intValue(); i < (number-2); i++) {
                sum= first.add(second);
                System.out.println(+(i+3)+" Fibonacci number with value: "+sum);
                first=second;
                second= sum;
                double goldenProportion = second.doubleValue()/first.doubleValue();
                System.out.println(("goldenProportion: "+goldenProportion));
            }
        }

    }
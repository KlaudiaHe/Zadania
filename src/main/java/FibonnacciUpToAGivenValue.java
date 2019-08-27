import java.math.BigInteger;
import java.util.Scanner;

public class FibonnacciUpToAGivenValue {
    public static void main(String [] args){
        System.out.println("Enter an integer: ");
        Scanner yourNumber = new Scanner(System.in);
        int number = yourNumber.nextInt();
        if(number>1) {
            System.out.println("The Fibonacci numbers less than " + number + " are: ");
            System.out.print("0, 1, 1, ");
            int f2=1;
            int sum= 1;

            for(int iButF1Somehow=1; iButF1Somehow+f2 < number;){
                sum = iButF1Somehow + f2;
                iButF1Somehow = f2;
                f2 = sum;
                System.out.print(" index: "+(iButF1Somehow+2)+" value: "+sum);
            }
        } else {
            System.out.println("There are no numbers less than " + number + " in the series");
        }
    }

}
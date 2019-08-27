import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main (String args[]){
        System.out.println("How many numbers from Fibonacci series do you want to get?");
        Scanner numberOfFibonacciNumbers = new Scanner(System.in);
        int numberToStatic = numberOfFibonacciNumbers.nextInt();
        int yourNumber = numberToStatic; //jakieś dziwne obchodzenia static było wymagane

        System.out.print(first + " " + second); // druk 0 i 1
        printFibonacci((yourNumber-2));// bo 0 i 1 są druknięte already
    }
    /*  Każdy jest sumą 2 poprzednich, yyyy
         0 + 1 -> 1
         1 + 1 -> 2
         1 + 2 -> 3 - pierwszy staje się dotychczasowym drugim, a drugi sumą swojego minionego już ja i dawnego firsta
         2 + 3 -> 4
    */
            static int first = 0, second = 1, sum =0;
            //nooo... rekursywność wymaga zdefiniowania funkcji  by ją wywołać rekursywnie
            static void printFibonacci (int number){
                if (number > 0) {
                    sum = first + second;
                    System.out.print(" " + sum);
                    first = second;
                    second = sum;
                    printFibonacci(number - 1);
                }
            }
      }
// deklarujesz inta w printFibonacci!!!!
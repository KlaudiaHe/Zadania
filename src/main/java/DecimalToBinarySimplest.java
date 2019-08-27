import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinarySimplest {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an integer: ");
            Scanner scanner = new Scanner(System.in);
            int numberToBinary = scanner.nextInt();
            if (numberToBinary<0){
                numberToBinary=numberToBinary*-1;
            }
            if (!(numberToBinary==0)){
            System.out.println(Integer.toBinaryString(numberToBinary));
        } else {
                System.out.println("O to binary is 0");
       }
        }
            catch (InputMismatchException e) {
            System.out.println("Only integers, please");
        }
    }
}
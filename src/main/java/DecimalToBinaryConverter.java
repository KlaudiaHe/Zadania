import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        try {
        System.out.println("Please enter an integer to convert it to binary (negative numbers will be converted to positive");
        Scanner scanner = new Scanner(System.in);
        int numberToBeConvertedToBinary = scanner.nextInt();
        if (numberToBeConvertedToBinary<0){
            numberToBeConvertedToBinary=numberToBeConvertedToBinary*-1;
        }
//        if (numberToBeConvertedToBinary ==0){
//            System.out.println("Binary version of 0 is 0");
//        }
        if (!(numberToBeConvertedToBinary==0)) {
            int[] binaryFormTable = new int[40];
            int index = 0;
            while (numberToBeConvertedToBinary > 0) {
                binaryFormTable[index++] = numberToBeConvertedToBinary % 2; //interesting z tym przyrostem indeksa; ZAJEBISTE
                numberToBeConvertedToBinary = numberToBeConvertedToBinary / 2;
            }
            System.out.println("Binary version of your number: ");
            for (int i = index; --i >= 0; ) {
                System.out.print(binaryFormTable[i]);
            }
        } else {
            System.out.println("Binary version of 0 is 0 ");
        }
    } catch (InputMismatchException e) {
            System.out.println("Only integers, please");
        }
    }
}

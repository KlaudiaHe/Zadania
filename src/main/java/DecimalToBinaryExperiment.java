import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryExperiment {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter an integer to convert it to binary: ");
            Scanner scanner = new Scanner(System.in);
            int numberToBeConvertedToBinary = scanner.nextInt();
            int []binaryDivisionresults= new int[40];
            int index= 0;
            int result= numberToBeConvertedToBinary;
            // You divide the given number by 2 till the number is decreased to 0 (ending the cycle of division).
            // Each time you make the division by 2, you begin with writing down the remainder from this division (0 or 1).
            // If you're dealing with an odd number, than the foreseen remainder is 1, e.g. 11/2 --> you write down 1, cause the remainder will be 1.
            // Then you  subtract the remainder from the number, e.g. (11-1)=10, and divide it by 2: 10/2= 5.
            // Now again, 5/2 --> remainder 1, (5-1)/2= 2
            // But 2 is an even number, so 2/2 --> remainder 0; then: 2-0=2;  2/2=1;
            // And 1/2 --> remainder 1.
            // And with this division we finally got to the result 0, so no more calculations and remainders.
            // Finally, you obtain the binary sequence (remainders) by reading them in reversed order (last to first): 1 0 1 1.
             while (result >0) {
                binaryDivisionresults[index++]=result%2;
                result=result/2;
//                resultOfDivisionByTwo[index++]= numberToBeConvertedToBinary%2;
//                numberToBeConvertedToBinary= (numberToBeConvertedToBinary/2);
            // Perhaps 'result' is somehow redundant (compare with DecimalToBinaryConverter,
            // But it's meant to make calculations easier to understand:
            }
            for (int i = index; --i >=0;) {
                System.out.print(binaryDivisionresults[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Only integers, please");
        }
    }
}

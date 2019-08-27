import java.util.*;

public class DecimalToBinaryWithStack {
    public static void main(String[] args) {
     try {
         System.out.println("Enter an integer (negative numbers will be converted to positive): ");
         Scanner scanner = new Scanner(System.in);
         int numberToBinary = scanner.nextInt();
         if (numberToBinary<0){
            numberToBinary=numberToBinary*-1;
         }
         ArrayList<Integer> binaryArrayList = new ArrayList<>();
         Stack<Integer> binaryStack = new Stack<>();
         if (numberToBinary==0){
             System.out.println("Binary representation of 0 is 0");
         }
         while (!(numberToBinary == 0)) {
             int partlyConverted = numberToBinary % 2;
             binaryStack.push(partlyConverted);
             binaryArrayList.add(partlyConverted);
             numberToBinary /= 2; //interesting, this /=;
             //  System.out.println(partly);
         }
         System.out.println("Arraylist: ");
         for (int i = binaryArrayList.size() - 1; i >= 0; i--) {
             System.out.print(binaryArrayList.get(i));
         }
         System.out.println();
         System.out.println("Stack: ");
         for (int i = binaryStack.size() - 1; i >= 0; i--) {
             System.out.print(binaryStack.get(i));
         }
     } catch (InputMismatchException e) {
         System.out.println("Only integers, please");
     }
    }
}

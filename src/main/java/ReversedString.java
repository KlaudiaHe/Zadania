import java.util.Scanner;

public class ReversedString {
        public static void main(String[] args) {
            System.out.print("Enter a String to reverse:");
            Scanner scanner = new Scanner(System.in);
            String stringy = scanner.nextLine();
            String reversed = " ";

            for (int i = stringy.length()-1; i >0; i--){
                reversed = reversed + stringy.charAt(i);
            }

            System.out.println("Reversed string is: ");
            System.out.println(reversed);
        }}


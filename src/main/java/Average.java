import java.util.ArrayList;
import java.util.Scanner;

public class Average
{

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a list of numbers:");
        try {
            String[] inputNumbers = scanner.nextLine().split("\\s");
        for (int i= 0; i < inputNumbers.length; i++)
            numbers.add(Double.parseDouble(inputNumbers[i]));
            if (numbers.size() == 0) {
                System.out.println("No average with no input");
        } else {
            double total = 0;
            for (double element : numbers) {
                total += element;
            }
            double average = total/numbers.size();
            System.out.println("The average is: " + average);
        }
    }  catch (NumberFormatException e){
    System.out.println("Only integers, please");
}
        scanner.close();
}}
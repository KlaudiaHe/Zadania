import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsOnNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        System.out.println("Please enter some integers in a format: n1 n2 n3 ... ni, and after you're done please type 'ok'(or any non-numeric key) and hit Enter");
            Scanner input = new Scanner(System.in);

            while (input.hasNextInt()) {
                integers.add(input.nextInt());
            }
            System.out.println("Size of your arraylist: ");
            System.out.println(integers.size());
            System.out.println("The integers as you entered them:" + integers);
            System.out.println("Numbers in reversed order:");
            System.out.println(NumbersReversed(integers));
            System.out.println("Only numbers at odd indexes: ");
            System.out.println(NumbersAtOddIndexes(integers));
            System.out.println("Only numbers divisible by 3: ");
            System.out.println(NumbersDivisibleByThree(integers));
            System.out.println("Sum of all numbers you entered: ");
            System.out.println(SumOfAllNumbers(integers));
            System.out.println("Sum of up to first four elements of Arraylist: ");
            System.out.println(SumOfFirstFourNumbers(integers));
            System.out.println("Sum of last five elements of Arraylist greater than 2: ");
            System.out.println(SumOfLastFiveNumbersGreaterThanTwo(integers));
            System.out.println("Sum of first couple of Arraylists elements that exceeds 10: ");
            System.out.println(SumOfFirstFewElementsThatIsGreaterThanTen(integers));
    }


    private static ArrayList<Integer> NumbersReversed(ArrayList<Integer> numbers) {
        int size = numbers.size();
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = size; --i >= 0; ) { //loop inspired by this article: https://www.javaworld.com/article/2077647/make-java-fast--optimize-.html
            reversed.add(numbers.get(i));
        }
        return reversed;
    }

    private static ArrayList<Integer> NumbersAtOddIndexes(ArrayList<Integer> numbers) {
        int size = numbers.size();
        ArrayList<Integer> atOddIndexesOnly = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!(i % 2 == 0)) {
                atOddIndexesOnly.add(numbers.get(i));
            }
        }
        return atOddIndexesOnly;
    }

    private static ArrayList<Integer> NumbersDivisibleByThree(ArrayList<Integer> numbers) {
        int size = numbers.size();
        ArrayList<Integer> divisibleByThreeOnly = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if ((numbers.get(i) % 3 == 0) && !(numbers.get(i) == 0)) {
                divisibleByThreeOnly.add(numbers.get(i));
            }
        }
        return divisibleByThreeOnly;
    }

    private static int SumOfAllNumbers(ArrayList<Integer> numbers) {
        int size = numbers.size();
        int sumOfAll = 0;
        for (int i = 0; i < size; i++) {
            sumOfAll += numbers.get(i);
        }
        return sumOfAll;
    }

    private static int SumOfFirstFourNumbers(ArrayList<Integer> numbers) {
        int sumOfFirstFour = 0;
        int size = numbers.size();
        if (size >= 4) {
            for (int i = 0; i < 4; i++) {
                sumOfFirstFour += numbers.get(i);
            }
        }
        if (size < 4) {
            for (int i = 0; i < size; i++) {
                sumOfFirstFour += numbers.get(i);
            }
        }
        return sumOfFirstFour;
    }

    private static int SumOfLastFiveNumbersGreaterThanTwo(ArrayList<Integer> numbers) {
        int sumOfLastFiveGreaterThanTwo = 0;
        int size = numbers.size();
        if (size > 5) {
            for (int i = size; --i >= (size - 5); ) {
                if (numbers.get(i) > 2) {
                    sumOfLastFiveGreaterThanTwo += numbers.get(i);
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (numbers.get(i) > 2) {
                    sumOfLastFiveGreaterThanTwo += numbers.get(i);
                }
            }
        }
        return sumOfLastFiveGreaterThanTwo;
    }

    private static int SumOfFirstFewElementsThatIsGreaterThanTen(ArrayList<Integer> numbers) {
        int sumGreaterThanTen=0;
        int sumOfAll=0;
        int size = numbers.size();
        for (int i = 0; i <size; i++) {
            sumOfAll+=numbers.get(i);
        }
        if (sumOfAll<10){
            System.out.println("Sorry, too few/too small value of elements to add up to 10");
        }
        if (sumOfAll>10){
        for (int i = 0; i < size; i++) {
            sumGreaterThanTen += numbers.get(i);
            if (sumGreaterThanTen > 10) {
                break;
            }
        }}
        return sumGreaterThanTen;
    }
}
//    private static ArrayList<Integer> NumbersReversed(ArrayList<Integer> numbers) {
//        int nOfElements= numbers.size();
//        ArrayList<Integer> reversed = new ArrayList<>(nOfElements);
//        for (int i=(nOfElements-1); --i >0;){
//            for(int k=0; k<nOfElements; k++) {
//                reversed.set(k, numbers.get(i));
//            }
//        }
//        return reversed;
//    }}
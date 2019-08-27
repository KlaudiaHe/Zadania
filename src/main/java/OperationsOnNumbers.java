import java.util.ArrayList;
import java.util.Scanner;

public class NumberOperatorAlt {
    /*
    8.2. wszystkie liczby od tyłu
    8.3. wszystkie na nieparzystych pozycjach
    8.4. wszystkie podzielne przez 3
    8.5. sumę wszystkich
    8.6. sumę pierwszych 4
    8.7. sumę ostatnich 5 liczb które są większe niż 2
    8.8. wypisz sumę liczb od początku tablicy która przekracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
     */

    public static void main(String[] args) {
            ArrayList<Integer> integers = new ArrayList<Integer>();
            System.out.println("Please enter some integers in a format: n1 n2 n3 ... ni, and after you're done please type 'ok' and hit Enter");
            Scanner input = new Scanner(System.in);
            while (input.hasNextInt()) {
                integers.add(input.nextInt());
            }
            System.out.println("The integers as you entered them:" + integers);
            System.out.println("Numbers in reversed order:");
            System.out.println(NumbersReversed(integers));
    }

    private static ArrayList<Integer> NumbersReversed(ArrayList<Integer> numbers){
        int size = numbers.size();
        ArrayList <Integer> reversed= new ArrayList<>();
    for (int i =(size); --i >= 0;){ //loop inspired by this article: https://www.javaworld.com/article/2077647/make-java-fast--optimize-.html
        reversed.add(numbers.get(i));
    }
    return reversed;
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
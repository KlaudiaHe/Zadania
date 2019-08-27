import java.util.Scanner;
import java.util.*;


//Rozwiązanie Igorka

public class PalindromesYetAgain {
    public static void main(String[] args) {
        System.out.println("Type a word to check if it's a palindrome:");
        Scanner yourWord = new Scanner(System.in);
        String isPalindromeOrNot = yourWord.nextLine().replaceAll("\\s+", "").toLowerCase();

        String reversed = reverse(isPalindromeOrNot);
        if (isPalindromeOrNot.toLowerCase().equals(reversed)) {
            System.out.println("That's a palindrome alright, looks the same both ways, take a look: "+isPalindromeOrNot);
        }else{System.out.println("Not a palindrome,cause here how it looks reversed: "+reversed);}
    }
    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}




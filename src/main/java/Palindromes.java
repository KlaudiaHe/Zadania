import java.util.Scanner;


public class Palindromes {
    public static void main(String[] args) {

        System.out.println(isItAPalindrome());
    }

        public static boolean isItAPalindrome() {
            System.out.println("Type a word to check if it's a palindrome:");
            Scanner yourWord = new Scanner(System.in);
            String isPalindromeOrNot = yourWord.nextLine().replaceAll("\\s+", "").toLowerCase();

            int isPalindromeOrNotLength = isPalindromeOrNot.length();

            for (int i = 0; i < isPalindromeOrNotLength / 2; i++) {
                if (isPalindromeOrNot.charAt(i) != isPalindromeOrNot.charAt(isPalindromeOrNotLength - i-1)) {
                    return false; //sout w tym miejscu to masakra
                }
            }
            return true;
    }}






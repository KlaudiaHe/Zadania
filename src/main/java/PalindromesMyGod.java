public class PalindromesMyGod {

    public static void main(String[] args) {
        System.out.println(isItAPalindrome("gagag"));
    }

    public static boolean isItAPalindrome(String yourWord) {
        return yourWord.equals(new StringBuffer().append(yourWord).reverse().toString());
    }
}


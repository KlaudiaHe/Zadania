import java.util.Scanner;

public class OtherPalindromes {

    public static void main(String[] args) {

    System.out.println(IsitAPal());
    }

    public static boolean IsitAPal(){

        System.out.println("Type a word to check if it's a palindrome:");
        Scanner checkedWord = new Scanner(System.in);
        String isItPalindrome = checkedWord.nextLine().replaceAll("\\s+", "").toLowerCase();

        int lengthOfPal = isItPalindrome.length();
        int leftmostIndex = 0;
        int rightmostIndex = lengthOfPal - 1;

        while (rightmostIndex > leftmostIndex) {  //tam montowaliśmy nowy String 'reversed'
            if (isItPalindrome.charAt(leftmostIndex) != isItPalindrome.charAt(rightmostIndex)) {
            return false;
            }
            ++leftmostIndex;
            --rightmostIndex;
            }
        return true;
    }
    }

    /*
    1. Wywołanie metody w doczepionym psvm; można też stworzyć oddzielnego runnera;
    2. Przy typie boolean sout(metoda) w psvm;
    3. Nie obsłuży iteracji najwyraźniej przy tak opakowanym indeksie (...:
            char leftmostCharacter = isItPalindrome.charAt(leftmostIndex);
            char rightmostCharacter = isItPalindrome.charAt(rightmostIndex);
            if (leftmostCharacter != rightmostCharacter))
       W efekcie kod znacznie prostszy, tj. mniej inicjowanych zmiennych;
       Czy istnieje coś jak dynamic variables for loop conditions?

    */
import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {
        System.out.println("Please type your statement:");
        Scanner statement = new Scanner(System.in);
        String toBeUppercase = statement.nextLine();
        System.out.println(UpperCaseMethod(toBeUppercase));
    }

    public static String UpperCaseMethod(String toBeUppercase) {
            String uppercasedString = "";
                for (int i = 0; i < toBeUppercase.length(); i++) {
            char character = toBeUppercase.charAt(i);
            char nowBigCharacter = Character.toUpperCase(character);
            uppercasedString= uppercasedString + nowBigCharacter;
            }
            return uppercasedString;
    }
}
/*żeby zawołana metoda w mainie wydrukowała nam rezultat działania UpperCaseMethod na toBeUppercase, metoda UpperCaseMethod musi coś zwracać przecie.
W tym przypadku zwraca uppercasedString.
 */
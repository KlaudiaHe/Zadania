import java.util.Scanner;

public class DecimalToBinary {
    //12. Napisz program który podaną liczbę wejściową wyświetli w postaci binarnej (system dwójkowy)

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner yourNumber = new Scanner(System.in);
        int numberToBinary = yourNumber.nextInt();

        System.out.println(Integer.toBinaryString(numberToBinary));

    }

}

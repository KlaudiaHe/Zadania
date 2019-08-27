import java.math.BigInteger;

class FibonacciToBinary{
    public static void main(String[] args) {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.valueOf(0);
//hm... tu zainicjalizowane zmienne do iteracji
        int space = 80; //tu na potrzeby sformatowanego printa zainicjalizowana zmienna
        System.out.println("A little explanation: beneath you get an index of a Fibonacci number, it's value and then it's binary equivalent");
        for (int i = 0; i < 101; i++) { //tu decyzja ile wyrazów fibonacciego
            first=second; //bez tego nie drukuje wartości dla danej liczby fibonacciego, czyli... sumy jako second?
            second= iterativeFibonacci(i); //tu call metody operujacej na tej zmiennej, bardzo zajebißcie
            String niceFormat = String.format("|%4d|%50d|%" +space + "s|", i, first, fibonacciToBinary(second, space));
            System.out.println(niceFormat); //formacik printa
        }
    }

    private static String fibonacciToBinary(BigInteger number, int spaceZeros) {
        String stringBinaryNumber = "";
        for (int i = 0; i < spaceZeros; i++) {
            if (number.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) { //jeßli reszta z dzielenia = 1;
                stringBinaryNumber = "1" + stringBinaryNumber; //od tylca niejako, czy moæe od prawej. HMMMMM
            } else {
                stringBinaryNumber = "0" + stringBinaryNumber;
            }
            number = number.divide(BigInteger.valueOf(2));
        }
        return stringBinaryNumber;   //toto je poprawny result
    }

    public static BigInteger iterativeFibonacci(int i){
        if (i==0) {
            return BigInteger.ONE;
        } else if (i==1) {
            return BigInteger.ONE;
        } else {
            BigInteger first = BigInteger.ONE;
            BigInteger second = BigInteger.ONE;//znowu są inicjalizowane, i w tym elsie jest całość w sumie Fibonacciego;
            BigInteger sum;
            for (int j = 0; j < i; j++) {
                sum= first.add(second);
                first = second;
                second = sum;
            }
            return second; //<--- tak wygląda poprawne return statement;
        }

}
}
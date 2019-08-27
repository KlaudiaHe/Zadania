import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

    public class FibonacciToBinaryTreePNG {
        public static void main(String[] args) throws IOException {
            int spaceWidth = 10000;
            int spaceHeight = 10000; //wymiary obrazka
            BufferedImage space = new BufferedImage(spaceWidth, spaceHeight, BufferedImage.TYPE_INT_RGB); //nowy obrazek;
            Graphics2D choina = space.createGraphics(); //tworzymy obrazek;
            choina.setColor(Color.black);
            choina.fillRect(0, 0, spaceWidth, spaceHeight); //białe tło
            choina.setColor(Color.white); //drukować będziemy na ciemnoszary dla eksperymentu;
            for (int i = 0; i < spaceHeight; i++) {
               // System.out.println(i); po co toto
                BigInteger sum = iterativeFibonacci(i); //sposób na wartość liczby Fibonacciego
                String binary = toBinary(sum, spaceWidth); //sposób na wartość binarną tejże liczby
                char[] chars = binary.toCharArray(); // tu jednak binary jako array characterów
                for (int j = 0; j < chars.length; j++) {
                    if(chars[j] == '1') {
                        choina.fillRect(j, i, 1, 1); //wypełnianie tylko czarnym gdy wystepuje 1. 0 samo się robi jako pusta przestrzeń zdradzająca tło;
                    }
                }
                }
            choina.dispose(); //wywalanie z pamięci Sosnowca;
            File choiniec = new File("choiniec.png"); //utworzenie pliku;
            ImageIO.write(space, "png",choiniec);//zapis do pliku;
        }

        //czyli w psvm zapisujemy obrazek i tylko wołamy 2 metody do obsługi;

        private static String toBinary(BigInteger number, int spaceZeros) {
            String sum = ""; //stringi z poszczególnymi liczbami Fibonacciego;
            for (int i = 0; i < spaceZeros; i++) {
                if(number.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                    sum = "1" + sum; //ale... że co;
                } else {
                    sum = "0" + sum;
                }
                number = number.divide(BigInteger.valueOf(2));
            }
            return sum; //tak wygląda prawidłowe return statement; sum zainicjowana przed pętlami, idzie przez pętle, wypluwa ją return;
        }

        public static BigInteger iterativeFibonacci(int i) { //tu są złapane 0 i 1 w pętlę.
            if (i == 0) {
                return BigInteger.ONE;
            } else if(i == 1) {
                return BigInteger.ONE;
            }
            else {
                BigInteger first = BigInteger.ONE;
                BigInteger second = BigInteger.ONE;
                BigInteger sum;
                for (int j = 0; j < i; j++) {
                    sum = first.add(second);
                    first = second;
                    second = sum;
                }
                return second;  //zwraca seconda a nie sumę. hm...
            }
        }
    }
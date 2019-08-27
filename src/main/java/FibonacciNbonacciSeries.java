/*
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
*/
/*
public class NbonacciSeries {

// Java program print first M
// terms of N-bonacci series.

    public static void main(String args[])
    {
        BigInteger sumNumber = BigInteger.valueOf(5), sequenceNumber = BigInteger.valueOf(2000);
        bonacciSeries(sumNumber, sequenceNumber);
    }

// Function to print
// bonacci series

        static void bonacciSeries(BigInteger sumNumber, BigInteger sequenceNumber)
        {
            // Assuming m >= n.
           ArrayList<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>(sequenceNumber.intValue()); ////no nie wiem; z tym intem

           int firstNonZeroElement = sumNumber.subtract(BigInteger.valueOf(1)).intValue();

           fibonacciNumbers.add(firstNonZeroElement, BigInteger.valueOf(1));

            // Computing every term as sum of previous n terms.

            for (BigInteger i = sumNumber; i.compareTo(sequenceNumber) < 0; i.add(BigInteger.valueOf(1))) {//co tu long da?. æe castuje potem;
                for (int j = i - n; j < i; j++) {//dobro
                    a[i] += a[j]; //dobrex;
                }
            }

            ArrayList<BigInteger> presentableNumbers = new ArrayList<>();   //jak tu to zmusi©;
            for (int i = 0; i < m; i++)
                for (int j = 0; j < presentableNumbers.size(); j++) {
                    presentableNumbers.get(j) = BigInteger.valueOf(a[i]);
                }

                System.out.print(presentableNumbers.get(j)+ " ");
        }


    }

// This code is contributed by
// Manish Shaw(manishshaw1)



*/
import java.util.Arrays;
import java.util.Scanner;

public class StarSquare {

    public static void main(String[] args) {
/*
        System.out.println("Pick an uneven number greater or equal to 3 to create a two-dimensional table");

        Scanner givenSize = new Scanner(System.in);

        int size = givenSize.nextInt();
*/

        int size = 5;
        String[][] stars = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i==(size/2)) && (j==(size/2))) {
                    stars[i][j] = " ";
                } else {
                        stars[i][j] = "*";
                    }
                }}

        for (int i=0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(stars[i][j]);
                System.out.print("");
            }
            System.out.println(); /*co to zmienia?*/
        }


        System.out.println("A raw table: ");
        for (int i = 0; i <size; i++) {
                System.out.println(Arrays.toString(stars[i]));
            }

        System.out.println("A raw table on it's side: ");

        for (int j = 0; j < size; j++) {
            System.out.println(Arrays.toString(stars[j]));
        } //bokiem.
    }



}

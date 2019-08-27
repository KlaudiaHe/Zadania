import java.util.Arrays;

public class StarSquareOFYourChoice {
    public static void main(String[] args) {


        int size = Integer.parseInt(args[0]);

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
        for (int i = 0; i <size; i++) {
            System.out.println(Arrays.toString(stars[i]));
        }


        for (int j = 0; j < size; j++) {
            System.out.println(Arrays.toString(stars[j]));
        } //bokiem.





    }
}

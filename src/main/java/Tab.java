    public class Tab {

        public static void main(String[] args) {
            final int MATRIX_SIZE = 5;
            int [][] tab = new int[MATRIX_SIZE][MATRIX_SIZE];

            // fill row 3 with 1 value
            int rowToChange = 2;
            for (int y=0;y<MATRIX_SIZE;y++) {
                tab[rowToChange][y]= 1;
            }

            // show table
            for (int x=0;x<MATRIX_SIZE;x++) {
                for (int y=0;y<MATRIX_SIZE;y++) {
                    System.out.print(tab[x][y]+" ");
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }

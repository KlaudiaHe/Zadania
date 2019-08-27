import java.util.Scanner;

public class UppercaseQuit {

        public static void main(String[] args) {
            UpperCaseMethod();
              }


            public static void UpperCaseMethod() {
            String uppercasedString = "";
            while (!uppercasedString.equals("q!")) {
                System.out.println("Please type your statement:");
                Scanner statement = new Scanner(System.in);
                uppercasedString = statement.nextLine();
                System.out.println(uppercasedString.toUpperCase());
            }
                System.out.println("you quitted");
            }

            }

            /* niepotrzebna for loop wewnątrz */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class ReadTextFromFile {

        public static void main(String[] args)  {
            ReadTextFromFile.readTextFromFile();
        }

        public static void readTextFromFile()  {
            boolean fileReadSucceed = false;

            do {
                Scanner scannerSystemIn = new Scanner(System.in);
                System.out.print("Please type file path :");
                String path = scannerSystemIn.nextLine();
                File file = new File(path);
                Scanner scanner = null;
                try {
                    scanner = new Scanner(file);
                    String text = scanner.nextLine();
                    System.out.println(text);
                    fileReadSucceed = true;
                } catch (FileNotFoundException ex) {
                    System.out.println("File from path " + path + " " +
                            "wasn't found ");
                    fileReadSucceed = false;
                }
            } while (fileReadSucceed==false);

            System.out.println("This is the end");
        }
    }


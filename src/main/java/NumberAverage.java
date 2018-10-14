public class NumberAverage {

    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        int aParsed = Integer.parseInt(a);
        int bParsed = Integer.parseInt(b);
        getAverage(aParsed,bParsed);
    }
       public static void getAverage (int a, int b){
           System.out.println((a + b)/2);
        }

    }

import java.util.ArrayList;

public class AverageVarargs {
    public static void main(String[] args) {
        average(1, 1);
        average(14, 3);
        average(3, 45, 43, 0, 789, 7, 8);
        average(-4, 5, 15);
    }

    static void average(int ...integers){
        double sum=0;
        double average;
    ArrayList<Double> numbersToAverage = new ArrayList<>();

        for (int i = 0; i <integers.length; i++) {
            numbersToAverage.add(Double.parseDouble(String.valueOf(integers[i])));
        }
        for (double i : numbersToAverage) {
            sum+=i;
        }
        average= sum/(integers.length);
        System.out.println(average);
    }
}

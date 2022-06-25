import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] arrey1 = {1.2, 2.2, -1.5, 1.7, -1.8, -2.1, 1.2, 2.2, 1.5, -1.7, 1.8, 2.1, -3.2, 3.3, 4.2};
        double sum = 0.0;
        double amount = 0.0;
        boolean on = false;
        for (double summedNumbers : arrey1) {
            if (summedNumbers < 0) {
                on = true;
            }
            else if (on == true && summedNumbers > 0) {
                sum += summedNumbers;
                amount++;


            }
        }

        System.out.println(sum / amount);





















    }
}
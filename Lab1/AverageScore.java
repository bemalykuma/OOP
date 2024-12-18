package Lab1;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble(), y = input.nextDouble(), z = input.nextDouble(), avg;
        avg = (x + y + z) / 3;
        System.out.println(avg);
    }
}

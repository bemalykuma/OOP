import java.util.Scanner;

public class TaxEmployee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();
        if (income > 50000) {
            System.out.println(income * 0.1);
        } else {
            System.out.println(income * 0.05);
        }
    }
}

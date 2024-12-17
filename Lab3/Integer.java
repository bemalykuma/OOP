import java.util.Scanner;

public class Integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ood = 0, even = 0, input = sc.nextInt();
        while (input != -1) {
            if (input % 2 == 0) {
                even += 1;
            } else {
                ood += 1;
            }
            input = sc.nextInt();
        }
        System.out.println("Odd number = " + ood + " and Even number = " + even);
    }
}

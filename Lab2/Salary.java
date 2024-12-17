import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = input.nextLine();

        System.out.print("Please insert your age : ");
        int age = input.nextInt();

        System.out.print("Please insert number of working days  : ");
        int numDay1 = input.nextInt();

        System.out.print("Please insert number of absent days : ");
        int numDay2 = input.nextInt();

        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble(), salary, bonus = 0;

        if (age <= 30 && age >= 21) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (age <= 40 && age >= 31) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (age <= 50 && age >= 41) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if (age <= 60 && age >= 51) {
            salary = (numDay1 * 3000);
        } else {
            salary = 0;
        }

        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");

        if (weight >= 10 && weight <= 60) {
            bonus = salary + 5000;
        } else if (weight >= 61 && weight <= 90) {
            bonus = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Your salary and bonus is " + bonus + " Baht");
    }
}

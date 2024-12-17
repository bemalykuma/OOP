import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = input01.nextDouble();
        
        Scanner input02 = new Scanner(System.in);
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String accountType = input02.nextLine();
        
        if ( accountType.equals("A") | accountType.equals("C"))
            System.out.println("Your total money in one year = " + (money + (money * 0.015)));
        else if ( accountType.equals("B"))
                System.out.println("Your total money in one year = " + (money + (money * 0.02)));
        else if ( accountType.equals("x"))
                System.out.println("Your total money in one year = " + (money + (money * 0.05)));
    }
    
}
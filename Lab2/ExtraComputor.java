import java.util.Scanner;
public class ExtraComputor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert your monitor size 38 or 43 only");
        int size = sc.nextInt();
        
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int dvd = sc.nextInt();
        
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = sc.nextInt();
        
        double total = 375.99;

        System.out.println("======= Your order =======");
        System.out.println("* computor >>> 375.99$");
        if ( size == 38 ){
            System.out.println("* " + size + "\'Monitor >>> 75.99$");
            total += 75.99;
        }
        else if ( size == 43 ) {
            System.out.println("* " + size + "\'Monitor >>> 99.99$");
            total += 99.99;
        }
        if ( dvd == 1 ) {
            System.out.println("* DVD-ROM >>> 65.99$");
            total += 65.99;
        }
        if ( printer == 1 ) {
            System.out.println("* Printer >>> 125.00$");
            total += 125.00;
        }
        System.out.println("======= Total price >>> " + total +" ==========");
    }
    
}

package Lab10;

public class Main2 {

    public static void main(String[] args) {
        Customer cust = new Customer("Kuma", "Kuma");
        //for CustomerAPI
//        CustomerAPI cust = new CustomerAPI("Kuma", "Kuma");
        Account acct1 = new Account(5000, "kuma1");
        Account acct2 = new Account(3000, "kuma2");
        Account acct3 = new Account(5000, "kuma3");
        Account acct4 = new Account(1000, "kuma4");
        Account acct5 = new Account(3000, "kuma5");
//        Account acct6 = new Account(3000, "kuma6");
        
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
//        cust.addAccount(acct6);
        
        cust.getAccount(0).deposit(1000);
        cust.getAccount(1).withdraw(700);
        
        System.out.println(cust);

        for (int i=0; i<cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
//Test >> if Class Customer have acct > 5 = << ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 >> because set array of acct = 5
//Test >> If Class CustomerAPI have > 5 = will have > 5 acct mai error kubb
public class Account {

    public double balance;
    public String name;

    public Account(int i, String string) {
        //TODO Auto-generated constructor stub
    }

    public Account(double balance2, String name2) {
        //TODO Auto-generated constructor stub
    }

    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }

    public void withdraw(double b) {
        if (b >= 0) {
            balance -= b;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero.");

        }
        if (balance < 0) {
            balance += b;
            System.out.println("Your account balance is insufficient.");
        }
        return balance;
    }

    public void showInfo() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
}


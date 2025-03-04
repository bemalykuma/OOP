public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    
    public Customer() {
        this("", "", null);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String toString() {
        if ( acct == null ) {
            return firstName + " " + lastName + " doesn’t have account.";
        }
        return "The " + firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
    }
    
    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}

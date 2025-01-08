package Lab6;

public class Employee {

    private int energy;
    private String name;
    private Wallet wallet;
    private static String nationality = "Thai";

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }

    public boolean buyFood(Seller s) {
        Food f = s.sell(this);
        if (f != null) {
            eat(f);
            return true;
        }
        return false;
    }

    public void eat(Food f) {
        this.energy += Food.getEnergy();
    }

    public boolean equals(Employee e) {
        if (this.name.equals(e.name)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". \nI have " + energy + " energy left.\nI have a balance of "
                + getWallet().getBalance() + " baht.";
    }

}

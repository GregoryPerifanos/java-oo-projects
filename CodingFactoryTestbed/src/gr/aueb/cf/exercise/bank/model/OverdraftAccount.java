package gr.aueb.cf.exercise.bank.model;
/**
 * Κλάση που επεκτείνει τον τραπεζικό λογαριασμό για υπερανάληψη.
 */
public class OverdraftAccount  extends Account{
    private double overdraftLimit;

    public OverdraftAccount(Holder holder, String iban, double balance, double overdraftLimit) {
        super(holder, iban, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void setBalance(double balance) {
        if (balance < -overdraftLimit) {
            System.out.println("Error: Cannot set balance below overdraft limit.");
        } else {
            super.setBalance(balance);
        }
    }
}

package gr.aueb.cf.exercise.bank;

import gr.aueb.cf.exercise.bank.model.Account;
import gr.aueb.cf.exercise.bank.model.Holder;
import gr.aueb.cf.exercise.bank.model.JointAccount;
import gr.aueb.cf.exercise.bank.model.OverdraftAccount;

public class Main {
    public static void main(String[] args) {
        // Create Account
        Holder primaryHolder = new Holder("John Doe");
        Account account1 = new Account(primaryHolder, "123456789", 1000.0);

        // Print Account
        System.out.println("Account Information:");
        System.out.println("Holder: " + account1.getHolder().getFirstname() + account1.getHolder().getLastname());
        System.out.println("IBAN: " + account1.getIban());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println();

        // Create OverdraftAccount
        Holder overdraftHolder = new Holder("Jane Smith");
        OverdraftAccount account2 = new OverdraftAccount(overdraftHolder, "987654321", 500.0, 1000.0);

        // Print OverdraftAccount
        System.out.println("Overdraft Account Information:");
        System.out.println("Holder: " + account2.getHolder().getFirstname() + account2.getHolder().getLastname());
        System.out.println("IBAN: " + account2.getIban());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Overdraft Limit: " + account2.getOverdraftLimit());
        System.out.println();

        // Create JointAccount
        Holder jointHolder1 = new Holder();
        jointHolder1.setFirstname("Mike");
        jointHolder1.setLastname("Johnson");

        Holder jointHolder2 = new Holder();
        jointHolder2.setFirstname("Emily");
        jointHolder1.setLastname("Davis");
        JointAccount jointAccount = new JointAccount(primaryHolder, jointHolder1, "111122223333", 2000.0);

        // Print JointAccount
        System.out.println("Joint Account Information:");
        System.out.println("Primary Holder: " + jointAccount.getHolder().getFirstname() + jointAccount.getHolder().getLastname());
        System.out.println("Joint Holder: " + jointAccount.getJointHolder().getFirstname() + jointAccount.getHolder().getLastname());
        System.out.println("IBAN: " + jointAccount.getIban());
        System.out.println("Balance: " + jointAccount.getBalance());
    }
}

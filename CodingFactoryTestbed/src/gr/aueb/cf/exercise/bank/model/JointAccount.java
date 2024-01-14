package gr.aueb.cf.exercise.bank.model;

public class JointAccount extends Account {
    private Holder jointHolder;

    public JointAccount(Holder primaryHolder, Holder jointHolder, String iban, double balance) {
        super(primaryHolder, iban, balance);
        this.jointHolder = jointHolder;
    }

    public Holder getJointHolder() {
        return jointHolder;
    }

    public void setJointHolder(Holder jointHolder) {
        this.jointHolder = jointHolder;
    }

    @Override
    public String convertToString() {
        return super.convertToString() + ", " + jointHolder.convertToString();
    }
}

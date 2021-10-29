package java_exo_test.bank;

public class BankAccount {
    public static final double MAX_NEG_BALANCE = -500.;

    private final ClientInfo clientInfo;
    private double balance = 0;

    public BankAccount(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public double getBalance() {
        return this.balance;
    }

    public double pull(double amount) {
        if((amount <= 0) || ((amount > this.balance) && (!this.clientInfo.isMajor() || this.balance - amount < BankAccount.MAX_NEG_BALANCE)))
            return 0;

        this.balance -= amount;
        return amount;
    }

    public void push(double amount) {
        if(amount <= 0) return;
        this.balance += amount;
    }
}

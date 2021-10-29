package java_exo_test.bank;

public class Client {
    private final BankAccount bankAccount;
    private final ClientInfo clientInfo;

    public Client(int age) {
        this.clientInfo = new ClientInfo(age);
        this.bankAccount = new BankAccount(this.clientInfo);
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }
}

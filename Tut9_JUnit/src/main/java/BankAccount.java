public class BankAccount {

    private Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

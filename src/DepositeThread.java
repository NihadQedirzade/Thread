public class DepositeThread extends Thread {
    private BankAccount account;
    private double amount;
    public DepositeThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        account.deposit(amount);
    }
}
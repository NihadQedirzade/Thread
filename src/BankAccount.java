public class BankAccount {
    private double balance;
    public BankAccount(double ilkinbalans) {
        this.balance = ilkinbalans;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("deposit: " + amount + ",yeni balans: " + balance);
    }
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println( "yenibalans: " + balance);
        } else {
            System.out.println("balansdan cekdiyiniz mebleg balansdaki puldan coxdur");
        }
    }
    public double getBalance() {
        return balance;
    }
}


public class Main {
    public static void main(String[] args) {

        //sual1
//        CutThread cutThread = new CutThread();
//        TekThread tekThread = new TekThread();
//
//        cutThread.start();
//        tekThread.start();


        //sual2
        BankAccount account = new BankAccount(1000);

        Thread depositThread1 = new DepositeThread(account, 200);
        Thread withdrawThread1 = new WithdrawThread(account, 150);

        Thread depositThread2 = new DepositeThread(account, 300);
        Thread withdrawThread2 = new WithdrawThread(account, 400);

        depositThread1.start();
        withdrawThread1.start();

        depositThread2.start();
        withdrawThread2.start();

    }
    }

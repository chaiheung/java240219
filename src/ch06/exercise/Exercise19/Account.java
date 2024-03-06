package ch06.exercise.Exercise19;

public class Account {

    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1_000_000;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE)
            this.balance = balance;
    }
}

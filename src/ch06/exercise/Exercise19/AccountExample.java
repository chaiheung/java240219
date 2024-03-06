package ch06.exercise.Exercise19;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10_000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(-100);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(2_000_000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(300_000);
        System.out.println("account.getBalance() = " + account.getBalance());
        

    }
}

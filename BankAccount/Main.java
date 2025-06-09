package Java.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anthony");
        bankAccount.deposit(300.0);
        bankAccount.deposit(500.0);
        bankAccount.withdraw(100.0);
        bankAccount.withdraw(2000.0);
    }
}

package Java;

public class BankAccount {
    private String accountOwner;
    private Double balance;

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.balance = 0.0;
    }

    public void deposit(Double amount) {
        System.out.println("Depositaste: " + amount);
        this.balance += amount;
        System.out.println("Tu nuevo balance es: " + this.balance);
    }

    public void withdraw(Double amount) {
        if (this.balance >= amount) {
            System.out.println("Retiraste: " + amount);
            this.balance -= amount;
            System.out.println("Tu nuevo balance es: " + this.balance);
        } else {
            System.out.println("No tienes suficiente dinero para retirar " + amount + " esa cantidad");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anthony");
        bankAccount.deposit(300.0);
        bankAccount.deposit(500.0);
        bankAccount.withdraw(100.0);
        bankAccount.withdraw(2000.0);
    }
}
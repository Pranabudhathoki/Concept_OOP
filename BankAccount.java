public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }


    public double getBalance() {
        return balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Pranab", 10000000);
        account.deposit(5000000);
        account.withdraw(2000000);
        System.out.println("Current balance: " + account.getBalance());
    }
}
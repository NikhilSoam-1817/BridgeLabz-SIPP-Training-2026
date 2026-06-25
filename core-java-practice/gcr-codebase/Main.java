

class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    private static int totalAccounts = 0;
    
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
     
     public static int getTotalAccounts() {
        return totalAccounts;
    }

}



  public class Main {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("101", "Dhruv", 10000);
        BankAccount acc2 = new BankAccount("102", "Rahul", 15000);
        BankAccount acc3 = new BankAccount("103", "Aman", 20000);

        // 5 transactions on Account 1
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(1000);

        // 5 transactions on Account 2
        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.withdraw(1000);

        // 5 transactions on Account 3
        acc3.deposit(5000);
        acc3.withdraw(4000);
        acc3.deposit(2000);
        acc3.withdraw(10000);
        acc3.withdraw(3000);

        // Print statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("\nTotal Accounts Created: " +
        BankAccount.getTotalAccounts());
    }
}


public class SavingsAccount {
    
    // initate variables
    private int balance;
    
    // constructors of the class
    public SavingsAccount() {
        balance = 0;
    }
    
    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }
    
    // methods of the class
    public void greet() {
        System.out.println("Hello");
    }
    
    public int showBalance() {
        return balance;
    }
    
    public void deposit(int howMuch) {
        if (howMuch < 0) {
            System.out.println("Enter a positive amount");
        }
        else {
            balance = balance + howMuch;
        }
    }
    
    public void withdraw(int howMuch) {
         if (howMuch < 0) {
            System.out.println("Enter a positive amount");
        }
        else {
            balance = balance - howMuch;
        }
    }
}
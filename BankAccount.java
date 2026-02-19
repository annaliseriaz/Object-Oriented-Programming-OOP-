public class BankAccount {
  //attributes
  private String accountHolder;
  private String accountNumber;
  private double balance;

  //constructor
  public BankAccount (String accountHolder, String accountNumber, double initialBalance) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  //method to deposit money
  public void deposit (double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Invalid deposit amount:");
    }
}

  //method to withdraw money
  public void withdraw (double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: $" + amount);
    } else {
      System.out.println("Insufficient funds or invalid amount!");
    }
}

  //method to check balance
  public double getBalance() {
    return balance;
}

  //method to display account information
  public void displayAccountInfo() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Current Balance: " + balance);
  }
} 

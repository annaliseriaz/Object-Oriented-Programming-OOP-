public class MainBank {
  public static void main(String[] args) {
    //create a bank account object
  BankAccount myAccount = new BankAccount("John Doe", "ACC001", 1000.00);

  //display initial account information
  System.out.println("=== Initial Account Information ===");
  myAccount.displayAccountInfo();

  //perform transactions
  System.out.println("\n=== Performing Transactions ===");
  myAccount.deposit(500.00);
  myAccount.withdraw(200.00);

  //display updated account information
  System.out.println("\n=== Updated Account Information ===");
  myAccount.displayAccountInfo();
  }
}

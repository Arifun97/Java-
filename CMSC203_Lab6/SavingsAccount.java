public class SavingsAccount extends BankAccount {

   //instance variables
   private static double RATE = 2.5;
   private static int savingsNumber = 0;
   private String accountNumber;

  
   public SavingsAccount(String name, double amount) {
       super(name, amount);
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }

   public SavingsAccount(BankAccount oldAccount, double amount) {
       super(oldAccount, amount);
       savingsNumber++;
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }
   //method postInterest
   public void postInterest() {
	   RATE = (RATE / 100)/12;
       setBalance((getBalance()*RATE) + getBalance());
   }

   public String getAccountNumber() {

       return accountNumber;
   }

}
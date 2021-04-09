public class CheckingAccount extends BankAccount {

   // constant variable
   private static final double FEE = .15;

   //Constructor
   public CheckingAccount(String name, double amount) {
       super(name, amount);
       setAccountNumber(getAccountNumber() + "-10");
   }

   public boolean withdraw(double amount) {

     amount +=FEE;
     return super.withdraw(amount);
     
   }

}
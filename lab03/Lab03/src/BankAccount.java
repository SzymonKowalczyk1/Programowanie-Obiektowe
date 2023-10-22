public class BankAccount {
    public int balance;

   public void deposit (double amount) {
       balance += amount;
   }

   public void withdraw(double amount){
       balance -= amount;
   }
}

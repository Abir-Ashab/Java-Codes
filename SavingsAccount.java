package MyPackage;

public class SavingsAccount {
   public double annualInterestRate = 0.00;
   public double savingsBalance;
   
   private double calculateMonthlyInterest() {
	   return (savingsBalance*annualInterestRate)/12;
   }
   public void modifySavingsBalance() {
	   savingsBalance += calculateMonthlyInterest();
   }
   public void modifyInterestRate (double annualInterestRate) {
	   this.annualInterestRate =annualInterestRate;
   }
   }

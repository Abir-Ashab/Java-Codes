package MyPackage;

public class AccountController {
  public static void main(String[] args) {
  
	  SavingsAccount savingsAccount1=new SavingsAccount();
	  
	  SavingsAccount savingsAccount2=new SavingsAccount();
	  
	  savingsAccount1.savingsBalance = 2000;
	  savingsAccount2.savingsBalance = 3000;
	  
	  savingsAccount1.modifyInterestRate(0.04);
	  savingsAccount2.modifyInterestRate(0.05);
	  
	  for(int i=0;i<12;i++) {
		  savingsAccount1.modifySavingsBalance();
		  savingsAccount2.modifySavingsBalance();
		  
		  System.out.println("SavingsAccount1 (for month "+(i+1)+"):"+savingsAccount1.savingsBalance);
		  System.out.println("SavingsAccount2 (for month "+(i+1)+"):"+savingsAccount2.savingsBalance);
	  }
  }
}

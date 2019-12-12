package bank;

public class BankAccountTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		   A class to test the BankAccount class.
		*/
		   
		      //This line creates a new BankAccount object called harrysChecking with 0 balance
			  BankAccount harrysChecking = new BankAccount(1000);
			  BankAccount sallysChecking = new BankAccount(500);
			  
			  //This line calls the deposit method for harrysChecking
			  //Note the deposit is for $2000
		      harrysChecking.deposit(2000);
		      sallysChecking.deposit(700);
		      
		      //This line calls the withdrawal method for harrysChecking
		      //Note the withdrawal is for $500
		      harrysChecking.withdraw(500);
		      sallysChecking.withdraw(1300);
		      
		      //This line calls the getBalance method and prints it     
		      System.out.println(harrysChecking.getBalance());     
		      System.out.println(sallysChecking.getBalance());
		      
		      System.out.println("Expected: 2500"); 
		      System.out.println("Expected: -100");
		   }
		}


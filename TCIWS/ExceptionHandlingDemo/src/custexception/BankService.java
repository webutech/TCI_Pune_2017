package custexception;

public class BankService {
	
	private int balance=5000;
	public void withdraw(final int acNo,final int amount) throws InvalidAccountNumberException, InsufficientBalanceException{
		
		if(acNo!=101){
			throw new InvalidAccountNumberException("Your Account number is not valid");
		}
		if(amount>balance){
			throw new InsufficientBalanceException("Amount is greater than balance");
			
		}
		
		System.out.println("Initial Balace : "+balance);
		System.out.println("Account number : "+acNo);
		System.out.println("Amount withdraw : "+amount);
		balance=balance-amount;
		System.out.println("Available Balance : "+balance);
		
	}

}

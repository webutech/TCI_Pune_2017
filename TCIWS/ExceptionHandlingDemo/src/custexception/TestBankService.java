package custexception;

public class TestBankService {

	public static void main(String[] args){
		
		System.out.println("------Line First-----------");
		BankService bankService=new BankService();
		try{
		bankService.withdraw(101, 2000);
		}
		catch(InvalidAccountNumberException ex){
			System.out.println("Problem is : "+ex.getMessage());
		}
		catch(InsufficientBalanceException ex){
			System.out.println("Problem is : "+ex.getMessage());
		}
		System.out.println("-------Line Last-----------");

	}

}

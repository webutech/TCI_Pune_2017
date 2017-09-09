package custexception;

public class InvalidAccountNumberException extends Exception {

	public InvalidAccountNumberException(String errMsg){
		super(errMsg);
	}
}

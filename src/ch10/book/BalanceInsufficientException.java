package ch10.book;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}

package ch11.book;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// String 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}
}

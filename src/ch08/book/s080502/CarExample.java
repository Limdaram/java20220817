package ch08.book.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run(); // 한국한국한국한국
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); // 금호금호한국한국
	}
}

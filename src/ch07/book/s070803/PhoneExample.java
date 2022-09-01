package ch07.book.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone(); // abstract 안됨
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

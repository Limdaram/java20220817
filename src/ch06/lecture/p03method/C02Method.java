package ch06.lecture.p03method;

public class C02Method {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2("임채은");
		MyClass2 o2 = new MyClass2("임다람");
		
		o1.printName(); // instance method
		o2.printName(); // instance method
	}
}

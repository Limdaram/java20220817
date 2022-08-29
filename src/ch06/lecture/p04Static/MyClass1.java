package ch06.lecture.p04Static;

public class MyClass1 {
	// non static
	// instance field
	String name;
	
	// static field
	// static이 붙으면 class field
	static String company;
	
	// 생성자 constructor
	public MyClass1(String name) {
		this.name = name;
	}
	
	// non static method
	// (instance) method
	void printName() {
		System.out.println(name);
	}
	
	// static method
	// class method
	static void printCompany() {
		System.out.println(company);
	}
	
	
}


	
package ch06.lecture.p04Static;

public class MyClass2 {
	// (instance) field
	String name;
	
	// static field
	static String company = "topgun";
	static int rank;
	
	static {
		int a = 30;
		int b = 90;
		rank = a * b;
	}
	public MyClass2(String name) {
		this.name = name;
	}
}

package ch09.lecture.p02lambda;

public class MyClass7 {
	public static void main(String[] args) {
		MyInterface7 o1 = n -> n * 2;
		System.out.println(o1.method(9));
		
		MyInterface7 o2 = i -> i * i;
		System.out.println(o2.method(10));
	}
}

interface MyInterface7 {
	int method(int i);
}
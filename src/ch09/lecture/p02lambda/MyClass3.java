package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("hello");
		o1.method("hi");
		
		// {} 생략
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("oh");
		o2.method("A");
		
		// 파라미터가 하나라면 두문괄호도 생략 가능
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));
		
		o3.method("ha");
		o3.method("ho");
		
	}
}

interface MyInterface3 {
	void method(String s);
}

package ch06.lecture.p02constructor;

import ch06.lecture.p01field.MyClass2;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("iceman", 77);
		System.out.println(o1.name);
		System.out.println(o1.age);
		
		MyClass3 o2 = new MyClass3("Lim", 66);
		System.out.println(o2.name);
		System.out.println(o2.age);
		
//		MyClass2 o3Class2 = new MyClass3(); // 기본 생성자 안됨
	}
}

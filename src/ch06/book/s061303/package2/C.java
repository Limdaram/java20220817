package ch06.book.s061303.package2;

import ch06.book.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // default 다른 패키지 불가능
//		a.field3 = 1; // private 불가능
		
		a.method1();
//		a.method2(); // default 다른 패키지 불가능
//		a.method3(); // private 불가능
	}
}

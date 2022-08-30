package ch07.lecture.p01inheritance.package2;

import ch07.lecture.p01inheritance.package1.SuperClass6;

public class SubClass6 extends SuperClass6{
	public void someMethod() {
//		super.privateMethod(); // 다른 패키지는 private 안된다
//		super.packagePrivatedMethod(); 
		// 복사해서 packagePrivateMethod로 새로 만들어도
		// 다른 패키지에 있어서 안됨
		super.protectedMethod(); // 다른 패키지에 있어도 protected는 된다
		super.publicMethod();
	}
}

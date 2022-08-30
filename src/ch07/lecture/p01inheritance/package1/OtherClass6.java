package ch07.lecture.p01inheritance.package1;

public class OtherClass6 {
	public void someMethod() {
		SuperClass6 o1 = new SuperClass6();
//		o1.privateMethod(); 
		// OtherClass는 super가 상속이 안된 상태이다
		// privateMethod는 private으로 되어있어 안됨
		o1.packagePrivateMethod(); 
		// privateMethod를 packagePrivateMethod로 한번 더 복사해서 만들었기 때문에 
		// 같은 패키지 안에서 가능
		o1.protectedMethod();
		o1.publicMethod();
	}
}

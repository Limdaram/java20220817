package ch07.book.s0706.package1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	// A와 B는 같은 패키지 안에 있으므로 A의 접근이 가능하다
}

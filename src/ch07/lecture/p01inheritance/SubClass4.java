package ch07.lecture.p01inheritance;

public class SubClass4 extends SuperClass4 {
	
	// 상위클래스 메소드 재정의 (Override) 가능 // 다시 정의하기
	@Override // 컴파일러에게 재정의 (Override) 메소드 인지 점검받는 annotation
	public void method1() {		
		System.out.println("subclass4 method1");
	}
	
	public void method2() {
		System.out.println("subclass4 method2");
	}
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		super.method3();
	}
	// 단축키 활용 ctrl space
}

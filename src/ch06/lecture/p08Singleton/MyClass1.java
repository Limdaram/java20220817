package ch06.lecture.p08Singleton;

public class MyClass1 {
	
	private static final MyClass1 instance = new MyClass1();
	
	private MyClass1() {
		
	}
	
	public static MyClass1 getInstance() {
		return instance;
	}
	
	// 정적 필드는 외부 호출이 안되지만(private) 정적 메소드는 가능하도록(public) 하기 : Singleton 
}

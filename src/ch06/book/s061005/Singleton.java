package ch06.book.s061005;

public class Singleton {
	
	// 정적 필드는 private로 막기
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	// 정적 메소드는 호출할 수 있게 하기
	static Singleton getInstance() {
		return singleton;
	}
}

package ch06.lecture.p08Singleton;

public class C01Singleton {
	public static void main(String[] args) {
		
		// private MyClass 임으로 사용할 수 없다
//		MyClass1 o1 = new MyClass1();
//		MyClass1 o2 = new MyClass1();
		// 다른 주소
		
		MyClass1 o1 = MyClass1.getInstance();
		MyClass1 o2 = MyClass1.getInstance();
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		 // o1, o2 같은 주소
	}
}

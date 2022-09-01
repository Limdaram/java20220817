package ch07.lecture.p03abstract;

public class C01Abstract {
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1();
//		SuperClass1 o2 = new SuperClass1(); // abstract 안됨
		
		SuperClass1 o3 = new SubClass1(); // 타입으로는 사용 가능
	}
}

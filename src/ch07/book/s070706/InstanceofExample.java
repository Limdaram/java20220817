package ch07.book.s070706;

public class InstanceofExample {

	// 변환이 가능한지 확인하기
	public static void method1(Parent parent) {	
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	// 그냥 하기 : 오류 발생할 가능성 있음
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// child 안에 child // 가능
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		// child 안에 parent
		Parent parentB = new Parent();
		method1(parentB); // if문 검사
		method2(parentB); // method2는 강제형변환을 했기 때문에 오류가 날 수 있다
	}
	
}

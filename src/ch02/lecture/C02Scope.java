package ch02.lecture;

public class C02Scope {
	// 변수는 선언된 블럭{} 내에서만 사용 가능
	public static void main(String[] args) {
		int a = 3;
		
		if (true) {
			int b = 4;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
	}
}	

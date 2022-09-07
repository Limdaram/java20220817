package ch11.lecture.p01object;

public class C04HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		// 서로 다른 해시코드
		System.out.println(h1);
		System.out.println(h2);
		
		Object o3 = new Book(99);
		Object o4 = new Book(99);
		
		System.out.println(o3.equals(o4));
		// equals의 결과값이 true라면 해시코드의 값이 같아야 한다
		// 해시코드를 재정의하자
		
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}
}

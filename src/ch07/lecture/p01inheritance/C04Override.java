package ch07.lecture.p01inheritance;

public class C04Override {
	public static void main(String[] args) {
		Object o1 = new Object();
		String o2 = new String("java");
		
		System.out.println(o1.hashCode()); // 참조값
		System.out.println(o2.hashCode()); // 재정의된 메소드 리턴값
		
		System.out.println(System.identityHashCode(o1)); // 참조값
		System.out.println(System.identityHashCode(o2)); // 참조값
		
		// Object hashCode(참조값) 값과 id는 같다 : 하는일이 같다
		// String은 다른다 : 하는일이 다르다 항상 참조값을 반환하는게 아니다
	}
}

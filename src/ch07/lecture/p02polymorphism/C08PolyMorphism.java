package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		
		System.out.println(a.length());
		
		Object b = "coyote";
		
//		System.out.println(b.length()); // object에는 length 메소드가 없음 //안됨
		
		// 강제형변환
		String c = (String) b;
		System.out.println(c.length());
	}
}

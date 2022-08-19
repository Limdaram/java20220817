package ch03.lecture.p2inary;

public class C04StringToNumber {
	public static void main(String[] args) {
		String a = "10";
		int b = 30;
		
		System.out.println(a + b);
		
		int c = Integer.valueOf(a); // integer type으로 변환 : Integer.valueof();
		System.out.println(b + c);
		
		String d = "3.14";
		double e = 9.8;
		
		System.out.println(d + e); // "3.149.8"
		
		double f = Double.valueOf(d);
		System.out.println(e + f); // 12.9400000000000001
		
		String g = "infinity";
		System.out.println(g + e); // infinity9.8
//		System.out.println(Double.valueOf(g) + e); // infinity
		
		String h = "NaN";
		System.out.println(Double.valueOf(h) + e); // NaN
		
		// 기본 타입과 매치되는 참조타입
		/*
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * char : Character
		 * boolean : Boolean
		 */
		
				
	}
}


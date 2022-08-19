package ch03.lecture.p2inary;

public class C03Arithmetic {
	public static void main(String[] args) {
		// 실수는 근사치로 저장됨
		double a = 0.1;
		double b = 0.2;
		double c = a + b;
		System.out.println(c);
		
		// 0으로 나눌 때 주의
		
		int d = 3;
		int e = 0;
		System.out.println(e/d); // 0
//		System.out.println(d/e); // 0으로 나누기는 안됨
		
		
		if (e != 0) {
			System.out.println(d/e);
		}
		else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		// 실수를 0으로 나누면 infinity
		double f = 3.0;
		double g = 0.0;
		double h = -3.0;
		double i = -0.0;
		System.out.println(g/f); // 0.0
		System.out.println(f/g); // infinity
		System.out.println(h/g); // -infinity
		System.out.println(f/i); // -infinity
		
		// 0 으로 나눈 나머지 NaN
		System.out.println(f % g); // NaN (Not a Number)
		
		
	}
}

package ch03.lecture.p2inary;

public class C09Assignment {
	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		
		int i = 3;
		int j = 5;
		
		int k = i;
		System.out.println(k); // 3
		
		k += j;
		System.out.println(k); // 3 + 5 = 8
		
		k -= i;
		System.out.println(k); // 8 - 3 = 5
		
		k *= i;
		System.out.println(k); // 5 * 3 = 15
		
		k /= j;
		System.out.println(k); // 15 / 5 = 3
		
		k %= i;
		System.out.println(k); // 3 / 3의 나머지 = 0
	}
}

package ch04.lecture.p02method;

public class C09Return {
	public static void main(String[] args) {
		long a = sum(1, 10);
		System.out.println(a); // 1부터 10 사이의 정수 합 출력
		
		long b = sum(1, 100);
		System.out.println(b); // 1부터 100 사이의 정수 합 출력
		
		long c = sum(50, 200);
		System.out.println(c);
	}
	public static long sum(int a, int b) {
		long total = 0;
		for (int i=a; i<=b; i++) {
			total += i;
		}
		return total;
	}
}

package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		sum(1,10); // 1부터 10 사이의 정수 합 출력
		sum(1,100); // 1부터 100 사이의 정수 합 출력
		sum(50, 200); // 50부터 200 사이의 정수 합 출력
	}
	
	public static void sum(int a, int b) {
		long sum = 0;
		for (int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(a + " + " + b + " = " + sum);
	}
}

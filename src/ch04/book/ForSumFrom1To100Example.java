package ch04.book;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum1 = 0;
		for (int i=1; i<=5; i++) {
			sum1 += i;
		}
		System.out.println("1-5합 : " + sum1);
		
		
		int sum2 = 0;
		for (int i=5; i<=10; i++) {
			sum2 += i;
		}
		System.out.println("5-10합 : " + sum2);
		
		int sum3 = 0;
		for (int i=5; i>=1; i--) {
			sum3 += i;
		}
		System.out.println("5-1합 : " + sum3);
		
		int sum4 = 0;
		for (int i=10; i>=5; i--) {
			sum4 += i;
		}
		System.out.println("10-5합 : " + sum4);
	}
}

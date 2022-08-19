package ch03.book;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		// double z = x % y;
		
		System.out.println(Double.isInfinite(z)); // infinity인지 확인해보고 싶을때 : Double.isInfinity();
		System.out.println(Double.isNaN(z)); // NaN인지 확인해보고 싶을떄 : Double.isNaN();
		
		System.out.println(z + 2); // 문제가 되는 코드
		
	}

}

package ch03.book;

public class OverflowExample2 {
	public static void main(String[] args) {
		long x = 1_000_000;
		long y = 1_000_000;
		long z = x * y;
		
		System.out.println(z);
	}
}

package ch03.book;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1_000_000;
		int y = 1_000_000;
		int z = x * y; // 오버플로우
		
		System.out.println(z);
	}
}

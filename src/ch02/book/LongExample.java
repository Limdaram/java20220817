package ch02.book;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000; // 컴파일 에러
		long var4 = 10000000000L; // 뒤에 L 붙여서 에러 안남
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
}



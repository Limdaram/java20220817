package ch03.book;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // JDK33.0
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK
		// 순서에 따라 결과값이 달라진다
		System.out.println(str3);
		System.out.println(str4);
	}
}

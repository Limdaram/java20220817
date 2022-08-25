package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		int[] c = {3, 4, 5}; // 주소 23
		int[] d = {3, 4, 5}; // 주소 25
		
		System.out.println(c == d); // false // 주소가 다르기 때문에 같지 않다
		
		// content 비교 : Arrays.equals( , ) -> ture
		System.out.println(Arrays.equals(c, d)); // true
		
		int[] e = c; // e도 주소 23
		
		e[0] = 33; // 주소 23의 [0]이 33으로 변경
		System.out.println(c[0]); // 33
		
		System.out.println(e == c); // true
		System.out.println(Arrays.equals(c, d)); // false
		// c{33, 4, 5} != d{3, 4, 5}
		
		
	}
}

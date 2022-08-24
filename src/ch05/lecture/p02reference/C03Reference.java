package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = a;
		
		System.out.println(b[2]); // 5
		
		a = new int[] {9, 8, 7};
//		b = a;

		System.out.println(b[2]); // 그대로 5
		b[1] = 100;
		
		System.out.println(a[1]); // 8
	}
}

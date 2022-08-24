package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 1};
		System.out.println(a[0]);
		
		a = changeItems(a);
		
		System.out.println(a[0]);
	}
	public static int[] changeItems(int[] i) {
		System.out.println(i[0]);
		i = new int[] {3, 4, 5};
		return i;
	}
}

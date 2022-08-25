package ch05.lecture.p01array;

public class C11ForEach {
	public static void main(String[] args) {
		// 향상된 for (enhanced for, for-each)
		
		int[] a = {5, 7, 9, 11};

		// index 필요할때
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 필요없을때
		System.out.println("향상된 for문");
		for (int item : a) {
			System.out.println(item);
		}
	}
}

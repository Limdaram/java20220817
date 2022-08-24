package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {99, 100, 101};
		
		a[0] = 33; // {33, 4, 5}
		
		System.out.println(a[0]); // 33  
		
		int[] c = a; // {33, 4, 5}
		
		System.out.println(c[0]); // 33
		
		c[2] = 1000; // {33, 4, 1000}
		
		System.out.println(a[2]); // 
		
	}
}

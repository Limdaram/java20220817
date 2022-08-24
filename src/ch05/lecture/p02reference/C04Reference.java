package ch05.lecture.p02reference;

public interface C04Reference {
	public static void main(String[] args) {
		int a = 3;
		printVar(a); // 3
		
		int b = 5;
		printVar(b); // 5
		
		int[] c = {9, 1, 2};
		printArray(c); 
		
		int[] d = {99, 88, 77};
		printArray(d);
	}
	public static void printVar(int i) {
		System.out.println(i);
	}
	
	public static void printArray(int[] j) {
		System.out.println(j[0]);
	}
}

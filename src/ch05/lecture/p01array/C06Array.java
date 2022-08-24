package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9, 8};
		int[] arr2 = {100, 50};
		int[] arr3 = {99, 100, 101};
		
		printFirstItem(arr1);
		printFirstItem(arr2);
		printFirstItem(arr3);
		printFirstItem(new int[] {10000});
		
		printLastItem(arr1);
		printLastItem(arr2);
		printLastItem(arr3);
		printLastItem(new int[] {-1});
		
		printMiddleItem(arr1);
		printMiddleItem(arr2);
		printMiddleItem(arr3);
		printMiddleItem(new int[] {5, 6, 7, 8, 9});
		
	}
	
	public static void printFirstItem(int[] arr) {
		System.out.println(arr[0]);
	}
	
	public static void printLastItem(int[] arr) {
		System.out.println(arr[arr.length - 1]);
	}
	
	public static void printMiddleItem(int[] arr) {
		System.out.println(arr[arr.length/2]);
	}
}

package ch10.lecture.p02try;

public class C08MultiCatch {
	public static void main(String[] args) {
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception 발생");
		}
		catch (NumberFormatException e) {
			System.out.println("exception 발생");
		}
		
		
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
		}
		// 같은 결과값을 내고 싶다면 |(하이픈)으로 동시에 쓸 수 있다
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("exception 발생");
		}
		
		
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
		}
		catch (RuntimeException e) {
			System.out.println("exception 발생");
		}
		
		
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println("exception 발생");
		}
	
	}
}

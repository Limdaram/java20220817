package ch10.lecture.p02try;

public class C07Catch {
	public static void main(String[] args) {
		// catch 블럭은 순서가 상관 있음
		
		String[] arr = {"삼백", "사백"};
		
		try {
			int a = Integer.parseInt(arr[3]);
			System.out.println(a);
		}
		// catch 블럭이 여러개일 경우 순서대로 확인한다
		// 상위타입의 catch 블럭을 먼저 쓰면 안된다
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong index");
		}
		catch (NumberFormatException e) {
			System.out.println("wrong format");
		}
	}
}

package ch10.lecture.p02try;

public class C05Catch {
	public static void main(String[] args) {
		String[] arr = {"100", "200", "삼백"};
		
		try {
			int a = Integer.parseInt(arr[2]);
			System.out.println(a * 2);
			
		}
		// 여러 catch가 동시에 출력되는 경우는 없음
		// 해당되는 부분 하나만 출력
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 잘못작성");
		}
		catch (NumberFormatException e) {
			System.out.println("수의 형식이 잘못됨");
		}
		
		System.out.println("실행 흐름 이어감");
	}
}

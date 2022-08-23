package ch04.lecture.p01control;

public class C17DoWhile {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		do {
			System.out.println(2);
			System.out.println(3);
		}
		while (false);
		
		// 일단 2,3 출력한 후 while의 조건을 확인한다
		// 확인 후 false 이면 다음것 출력, true면 false가 될때까지 반복
		
		System.out.println(4);
		
		
		
	}
}

package ch04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		
		System.out.print("냐"); // 끝에 엔터없음
		System.out.println("냐냐"); //냐냐냐로 출력
		System.out.println(); // 아무것도 안쓰면 빈줄 출력
		System.out.println("임다람");
		
		System.out.println("별표찍기 print, println 로 분리");
	
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int x=1; x<=5; x++) {
			for (int y=5; y>=x; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=(6-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

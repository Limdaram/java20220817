package ch04.book;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		}
		while ( ! inputString.equals("q")); // == 쓰면 안됨 .equals 쓰기
		// 입력한 inputString이 q와 같지 않으면 반복
		// 같으면 다음으로 넘어가기 (프로그램 종료)
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}



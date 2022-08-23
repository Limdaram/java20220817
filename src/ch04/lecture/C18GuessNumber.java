package ch04.lecture;

import java.util.Scanner;

public class C18GuessNumber {
	public static void main(String[] args) {
		int com = (int)(Math.random()*100)+1;
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		do {
			System.out.println("(1~100) 입력 : ");
			
			user = scanner.nextInt();
			
			if (com == user) {
				System.out.println("정답");
				break;
			}
			else if (com > user) {
				System.out.println("더 큰값을 입력하세요");
			}
			else if (com < user) {
				System.out.println("더 작은값을 입력하세요");
			}
			
		}
		while (com != user);
		System.out.println("프로그램 종료");
		
	}
}

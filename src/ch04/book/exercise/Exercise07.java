package ch04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			
			System.out.println();
			System.out.print("선택> ");
			int user = scanner.nextInt();
			
			if (user == 1) {
				System.out.print("예금액> ");
				int money = scanner.nextInt();
				balance += money;
				System.out.println();
			}
			else if (user == 2) {
				System.out.print("출금액> ");
				int money2 = scanner.nextInt();
				balance -= money2;
				System.out.println();
			}
			else if (user == 3) {
				System.out.println("잔고> " + balance);
				System.out.println();
			}
			else if (user == 4) {
				System.out.println();
				System.out.println("프로그램 종료");		
				break;
			}
		}
	}
}

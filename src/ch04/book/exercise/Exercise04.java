package ch04.book.exercise;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[랜덤 주사위]");
		
		while (true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			if (num1 + num2 == 5) {
				System.out.println("정답입니다");
				break;
			}
		}
	}
}

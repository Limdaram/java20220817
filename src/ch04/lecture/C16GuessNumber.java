package ch04.lecture;

import java.util.Scanner; // ctrl shift o


public class C16GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("[숫자 맞추기]");
		int r = (int)(Math.random()*100)+1;
		
		while (true) {
			System.out.println("1부터 100사이의 값 : ");
			
			int user = scanner.nextInt();
			
//			System.out.println("답 : " + r);
			
			if (user == r) {
				System.out.println("정답입니다");
				break;
			}
			else if (user > r) {
				System.out.println("더 작은수를 입력하세요");
			}
			else if (user < r) {
				System.out.println("더 큰수를 입력하세요");
			}
		}
	}
}

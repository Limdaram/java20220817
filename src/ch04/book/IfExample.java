package ch04.book;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		if (score < 90)
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");
		// 실행해야 할 문장이 하나밖에 없다면 {}를 생략할 수 있다
		// 하지만 쓰는게 더 좋다
			
		// 조건이 false 이므로 출력하지 않는다
		// 두번째 문단은 if문과 상관없이 출력된다 (중괄호를 안썼기 때문에 상관없어졌다)
		
	}
}

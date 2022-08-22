package ch04.book;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter: for (char upper ='A'; upper<='Z'; upper++) {
			for (char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower == 'g') {
					break Outter; // 바깥 for문(Outter) 까지 빠져나오기
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}

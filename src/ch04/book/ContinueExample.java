package ch04.book;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if ((i%2)==1) {
				continue; // 나머지가 1이라면 (홀수라면) 실행하지 않고 다음 반복으로 넘어가자 (짝수면 실행 -> 짝수만 출력)
			}
			System.out.println(i);
		}
	}
}

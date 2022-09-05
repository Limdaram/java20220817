package ch10.lecture.p05throw;

import javax.management.RuntimeErrorException;

public class C01Throw {
	public static void main(String[] args) {
		method1();
		
		System.out.println("프로그램 실행 이어감");
	}
	
	private static void method1() {
		System.out.println("코드1");
		System.out.println("코드2");
		
		// 예외 발생
		// throw Exception
		throw new RuntimeException();
	}
}

package ch10.lecture.p05throw;

public class C02Throw {
	public static void main(String[] args) throws Exception {
		method1();
	}

	private static void method1() throws Exception {
		System.out.println("코드1");
		throw new Exception();
	}
}

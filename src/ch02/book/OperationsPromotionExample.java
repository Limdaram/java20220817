package ch02.book;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; // 안됨
		int byteValue3 = byteValue1 + byteValue2;
		System.out.println(byteValue3);
		
		char charValue1= 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; // 안됨
		int intValue1 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue1);
		System.out.println("출력문자 = " + (char)intValue1);
		
		int intValue2 = 10;
		int intValue3 = intValue2/4; // 10을 4로 나눴을때 : 2.5 지만 int이므로 2
		System.out.println(intValue3);
				
		int intValue4 = 10;
//		int intValue5 = 10 / 4.0; // 10은 int 4.0은 double // 안됨
		double doubleValue = intValue4 / 4.0;
		System.out.println(doubleValue); // double 이니까 소수점까지 나온다 : 2.5
				
	}
}

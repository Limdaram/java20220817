package ch03.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "임다람";
		String strVar2 = "임다람";
		String strVar3 = new String ("임다람");
		
		System.out.println(strVar1 == strVar2); // true
		System.out.println(strVar1 == strVar3); // false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // true
		System.out.println(strVar1.equals(strVar3)); // true
		
	}
}

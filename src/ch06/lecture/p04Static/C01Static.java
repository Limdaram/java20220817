package ch06.lecture.p04Static;

public class C01Static {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1("coyote");
		o1.printName();
		
		MyClass1 o2 = new MyClass1("phoenix");
		o2.printName();
		
		o1.company = "topgun";
		System.out.println(o1.company);
		System.out.println(o1.name);
		
		System.out.println(o2.company);
		System.out.println(o2.name);
		
		o1.company = "bottomgun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		
		o1.name = "maverick";
		System.out.println(o1.name);
		System.out.println(o2.name);
		
		MyClass1.company = "middlegun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		System.out.println(MyClass1.company); // 보통 class 인 경우는 이렇게 쓰자
		
		MyClass1.printCompany();
		o1.printName(); // 이렇게 쓰는건 흔치 않다
	}
}

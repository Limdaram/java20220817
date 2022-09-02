package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random() * 6) + 1;
			return d;
		};
		System.out.println(o1.method());
		
		// 한줄이라면 return 생략 가능
		MyInterface6 o2 = () -> (int) (Math.random()*6)+1;
		System.out.println(o2.method());
		
		MyInterface6 o3 = () -> {
			return (int) (Math.random()*6)+1;
		};
		System.out.println(o3.method());
	}
}

interface MyInterface6 {
	int method();
}
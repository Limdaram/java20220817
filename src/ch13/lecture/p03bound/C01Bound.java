package ch13.lecture.p03bound;

public class C01Bound {
	public static void main(String[] args) {
		MyClass1<Object> o1 = new MyClass1<>();
		MyClass1<String> o2 = new MyClass1<>();
		MyClass1<Number> o3 = new MyClass1<>();
		MyClass1<Integer> o4 = new MyClass1<>();
		
		MyClass2<Number> o5 = new MyClass2<>();
		MyClass2<Integer> o6 = new MyClass2<>();
		MyClass2<Double> o7 = new MyClass2<>();
		
		// 상위 타입은 안된다
//		MyClass2<String> o8 = new MyClass2<>();
//		MyClass2<Object> o9 = new MyClass2<>();

	}
}

class MyClass1<T> {
	
	public void method1(T p) {
		// object가 가지고 있는건 모두 사용 가능
		p.toString();
		p.equals(null);
		p.hashCode();
		
//		p.doubleValue(); // 사용x
		Number n = (Number) p; // 형변환해서 쓰던가
	}
}

// Number 타입으로 선언해 주면 형변환 하지 않아도 사용 가능
class MyClass2<T extends Number> {
	public void method1(T p) {
		p.doubleValue();
		p.intValue();
		p.byteValue();
	}
}

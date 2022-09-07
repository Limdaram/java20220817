package ch11.lecture.p01object;

// extends Object 생략 가능
public class C03Equals extends Object {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.println("Object equals()");
		System.out.println(b1.equals(b2)); // true
		System.out.println(b2.equals(b1)); // true
		System.out.println(b1.equals(b1)); // true
		System.out.println(b2.equals(b2)); // true
		
		// 참조값이 같아야만 true가 나온다
		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		System.out.println("Book equals()");
		System.out.println(b3.equals(b4)); // true
		System.out.println(b4.equals(b3)); // true
		
		Object b5 = new Book(777);
		System.out.println(b3.equals(b5)); // false
		System.out.println(b5.equals(b3)); // false
	}
}

class Book extends Object {
	private int code;
	
	Book() {
		
	}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book o = (Book) obj;
			
			if (obj != null) {
				return this.code == o.code;				
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return code * 31;
	}
}






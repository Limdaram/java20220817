package ch07.book.exercise.p06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동"); // this() 호출 -> this(String) 이니까 String name 호출
		System.out.println("Child() call");
	}
	
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

package ch06.book.exercise.p14;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member (String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.password = pw;
		this.age = age;
	}
	
	Member (String name, String id) {
		this.name = name;
		this.id = id;
	}
}

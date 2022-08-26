package ch06.lecture.p01field;

public class C01Class {
	public static void main(String[] args) {
		String a = new String("java");
		
		MyObject o1 = new MyObject();
		// 나만의 객체인 MyObject 만들고 싶다 -> 설계도를 만들자
		MyObject o2 = new MyObject();
		MyObject o3 = new MyObject();
		
	}
}

// class : 객체 설계도 (청사진)
// class 클래스명 {
//    클래스 body 
//}

// 클래스명 작성 관습 : UpperCamelCase
// 클래스명 작성 가능 문자 : 영문대소문자, _, $, 숫자

class MyObject {
	
}
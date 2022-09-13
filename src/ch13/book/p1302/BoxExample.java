package ch13.book.p1302;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get(); // 강제 변환
		
		box.set(new Apple());
		Apple apple = (Apple) box.get(); // 강제 변환
	}
}

package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};
		changeItems(a);
		
		System.out.println(a[0]); // i가 바꼈을 뿐이지 a가 바뀐건 아니기 때문에 그대로 답이 9가 나온다
		changeItems(a);
	}
	public static void changeItems(int[] i) {
		System.out.println(i[0]);
		i = new int[] {3, 4}; // i 바꾸기
	}
}

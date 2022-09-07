package ch11.lecture.p03string;

public class C05Replace {
	public static void main(String[] args) {
		String s1 = "coyote";
		String o1 = s1.replace('o', 'z');
		
		System.out.println(s1);
		System.out.println(o1);
		
		String s2 = "hashcode is code of";
		String o2 = s2.replace("code", "KODE");
		
		System.out.println(s2);
		System.out.println(o2);
		
	}
}

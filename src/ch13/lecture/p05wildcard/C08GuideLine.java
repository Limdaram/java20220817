package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C08GuideLine {
	public static void main(String[] args) {
		// PECS
		// Produce -> extends
		// consume -> super
		
		// g"e"t (얻을때) -> "e"xtends
		// p"u"t (넣을때) -> s"u"per
		
		// in -> extends
		// out -> super
		
	}
	
	public static void method1(ArrayList<? extends Number> list) {
		Number n1 = list.get(0);
//		list.add(3); // 넣는거 안됨
	}
	
	public static void method2(ArrayList<? super Number> list) {
//		Number n1 = list.get(0); // 얻는거 안됨
		list.add(3);
	}
}

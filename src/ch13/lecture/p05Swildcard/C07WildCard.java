package ch13.lecture.p05Swildcard;

import java.util.ArrayList;

public class C07WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(300);
		list1.add(500);
		
		getItems(list1);
		
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(3.14);
		list2.add(9.8);
		
		getItems(list2);
	}
	
	public static void getItems(ArrayList<? extends Number> list) {
		Number n1 = list.get(0);
		Number n2 = list.get(1);
		
		
	}
}

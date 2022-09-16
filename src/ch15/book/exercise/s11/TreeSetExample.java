package ch15.book.exercise.s11;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>((n1, n2) -> n1.score - n2.score);
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.score);
		System.out.println("최고점수를 받은 아이디 : " + student.id);
	}
}
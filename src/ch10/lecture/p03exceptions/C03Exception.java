package ch10.lecture.p03exceptions;

import javax.naming.NameAlreadyBoundException;

public class C03Exception {
	public static void main(String[] args) {
		
		try {
			Class a = Class.forName("java.lang.String");			
			System.out.println(a.toString());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

// 힌트 단축키 : ctrl + 1
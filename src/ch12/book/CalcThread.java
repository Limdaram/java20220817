package ch12.book;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for (int i=0; i<2000000; i++) {
			
		}
		System.out.println(getName());
	}
}

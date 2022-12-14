package ch12.book;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
	}
	
	Thread thread = new Thread(() -> {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
	});
}

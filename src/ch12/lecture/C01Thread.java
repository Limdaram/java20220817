package ch12.lecture;

public class C01Thread {
	public static void main(String[] args) throws Exception {
		
		// 문자와 소리가 따로따로 출력 (문자 다음 소리)
		
		// 문자 출력
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			
			// 실행 잠시 멈춤
			Thread.sleep(500);
		}
		
		// 소리 출력
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			
			// 실행 잠시 멈춤
			Thread.sleep(500);
		}
	}
}

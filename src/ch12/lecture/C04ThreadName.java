package ch12.lecture;

public class C04ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("1번");
		t1.setPriority(10); // 가장 높은 우선순위
		t1.start();
		
		Thread t2 = new Task5();
		t2.setName("2번");
		t2.setPriority(1); // 가장 낮은 우선순위
		t2.start();
	}
}

// setPriority 로 확률 높혀주기 (확률상 높아진거지 항상 그런건 아니다)

class Task5 extends Thread {
	@Override
	public void run() {
		for (int i=1; i<=100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

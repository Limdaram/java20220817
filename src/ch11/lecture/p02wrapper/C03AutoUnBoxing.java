package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 999;

		// 참조타입을 기본타입으로 변경 (unboxing)
		int b = a.intValue();
		
		// 참조타입을 기본타입으로 자동변경 (auto unboxing)
		int c = a; // 가능
		
		Object d = 99;
		// 상위타입을 하위타입에 넣을 수 없다
//		Integer e = d; 
//		int f = e;
		
		int g = (Integer) d; // 형변환 해서 넣을 수 있다(하지만 위험)
		
		Object[] arr = {"java", 3, 3.14};
		String s = (String) arr[0];
		Integer i = (Integer) arr[1];
		Double l = (Double) arr[2];
		
		double k = (double) arr[2]; // 단계를 두번 거쳐서도 가능 (-> Double -> double)
	}
}

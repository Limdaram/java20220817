package ch06.lecture.p10annotation;

@MyAnnotation3
public class C03Target {

		@MyAnnotation3
		private int i;
		
		@MyAnnotation3
		C03Target() {
			
		}
		
		@MyAnnotation3
		public void method(@MyAnnotation3 int i) {
//			@MyAnnotation3 // annotation에서 정의해주지 않았기 때문에 쓸 수 없다
//			int j;
		}
}

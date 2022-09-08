package ch06.lecture.p10annotation;

import ch05.book.Week;

public @interface MyAnnotation2 {
	String value() default ""; // element(attribute)
	int age() default 0;
	Week week() default Week.MONDAY;
	String[] names() default {};
}

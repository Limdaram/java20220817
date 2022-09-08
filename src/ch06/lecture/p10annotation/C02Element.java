package ch06.lecture.p10annotation;

import ch05.book.Week;

public class C02Element {
	@MyAnnotation2(value = "coyote")
	private int i;
	
	@MyAnnotation2(value = "iceman")
	private int j;
	
	@MyAnnotation2("maverick")
	private int k;
	
	@MyAnnotation2
	private int l;
	
	@MyAnnotation2(value = "iceman", age = 30) // 생략 안됨
	private int m;
	
	@MyAnnotation2(week = Week.THURSDAY)
	private int o;
	
	@MyAnnotation2(names = {"maverick", "phoenix"})
	private int p;
	
	@MyAnnotation2(names = {"rooster"})
	private int q;
	
	@MyAnnotation2(names = "rooster") // 배열값이 하나라면 {} 없어도 된다
	private int r;
}

package ch13.book.exercise.s02;

public class Container<C> {
	private C c;
	public C get() {
		return c;
	}
	public void set(C c) {
		this.c = c;
	}
}

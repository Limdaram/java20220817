package ch13.book.exercise.s03;

public class Container<T, V> {
	private T key;
	private V value;
	
	public T getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
//	public void set(T k, V v) {
//		key = k;
//		value = v;
//	}
	
	public void set(T key, V value) {
		key = this.key;
		value = this.value;
	}

}

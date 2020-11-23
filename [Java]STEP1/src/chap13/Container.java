package chap13;

public class Container<T> {
	private T data;
	
	public T get() {
		return this.data;
	}
	
	public void set(T data) {
		this.data = data;
	}
}

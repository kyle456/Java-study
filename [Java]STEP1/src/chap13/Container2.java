package chap13;

public class Container2<T, S> {
	private T key;
	private S value;
	
	public T getKey() {
		return key;
	}
	
	public S getValue() {
		return value;
	}
	
	public void set(T key, S value) {
		this.key = key;
		this.value = value;
	}
}

package chap13;

public class Pair<T, S> {
	private T key;
	private S data;

	Pair(T key, S data) {
		this.key = key;
		this.data = data;
	}
	
	public T getKey() {
		return key;
	}
	
	public S getData() {
		return data;
	}
}

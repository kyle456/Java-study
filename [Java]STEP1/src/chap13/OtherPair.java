package chap13;

public class OtherPair<T, S> {
	private T key;
	private S data;

	OtherPair(T key, S data) {
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

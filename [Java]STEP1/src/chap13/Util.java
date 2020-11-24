package chap13;

public class Util {
	public static <T, S> S getValue(Pair<T, S> pair, T key) {
		if (key.equals(pair.getKey())) {
			return pair.getData();
		}
		return null;
	}
}

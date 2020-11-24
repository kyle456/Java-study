package chap13;

public class Util {
	public static <T, S> S getValue(Pair<T, S> pair, T key) {
		if (key == pair.getKey()){
			return pair.getData();
		}
		return null;
	}
}

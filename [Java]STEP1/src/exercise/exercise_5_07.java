// 주어진 배열의 항목에서 최대값을 구하라. (for문을 이용할 것)

package exercise;

public class exercise_5_07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}

		System.out.println("max: " + max);

	}

}

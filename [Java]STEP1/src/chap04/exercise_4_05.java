package chap04;

public class exercise_4_05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; ++i) {
			for (int j = 1; j <= 10; ++j) {
				if ((i * 4) + (j * 5) == 60) {
					System.out.printf("(%d, %d)\n", i, j);
					break;
				}
			}
		}

	}

}

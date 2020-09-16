package chap04;

public class exercise_4_04 {

	public static void main(String[] args) {
		int num1, num2;

		do {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;

			System.out.printf("(%d, %d)\n", num1, num2);
		} while (num1 + num2 != 5);
	}

}

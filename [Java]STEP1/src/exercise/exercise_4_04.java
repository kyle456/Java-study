// while문과 Math.random()을 이용하여, 두 개의 주사위를 던졌을 때 나오는 눈을 출력하고
// 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춘다.
// 눈의 합이 5가 되는 조합은 (1,4) (4,1) (2,3) (3,2) 이다.

package exercise;

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
